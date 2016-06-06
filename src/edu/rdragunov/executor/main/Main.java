package edu.rdragunov.executor.main;

import edu.rdragunov.executor.data.TourtureResult;
import edu.rdragunov.executor.npc.CallExecutor;
import edu.rdragunov.executor.npc.Executor;
import edu.rdragunov.executor.npc.RunExecutor;
import edu.rdragunov.executor.npc.User;

import java.util.concurrent.*;

/**
 * Created by Rrr on 04.06.2016.
 */
public class Main {
    private static final Object lock = new Object();
    private static User runUser;
    private static User newRunUser;
    private static Executor runExecutor;
    private static Thread thread;

    private static User callUser;
    private static User newCallUser;
    private static Executor callExecutor;

    private static ExecutorService es= Executors.newFixedThreadPool(7);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        runUser=new User(User.getRandomSex());
        runExecutor=new RunExecutor(runUser);
        thread=new Thread(runExecutor);
        //Runnable
        run();

        //ReuseRunnable
        newRunUser=new User(User.Sex.MALE);
        runExecutor.setTourtureUser(newRunUser);
        try {
            run();
        }catch (Exception e){
            System.out.println("Exception!!!");
            e.printStackTrace();
            synchronized (lock) {lock.wait(100);}
        }

        //Callable
        callUser=new User(User.getRandomSex());
        callExecutor=new CallExecutor(callUser);
        call();

        //ReuseCallable
        newCallUser=new User(User.Sex.MALE);
        callExecutor.setTourtureUser(newCallUser);
        call();
        es.shutdown();
    }

    public static void run() throws InterruptedException, ExecutionException {
        System.out.println("--- start runnable executor ---");
        /*thread.start();
        thread.join();*/
        es.submit((Runnable) runExecutor).get();
        TourtureResult runResult=runExecutor.getTourtureResult();
        System.out.println(runResult);
        synchronized (lock) {lock.wait(100);}
    }

    public static void call() throws ExecutionException, InterruptedException {
        System.out.println("--- start callable executor ---");
        Future<TourtureResult> future=es.submit((Callable<TourtureResult>)callExecutor);
        TourtureResult tourtureResult=future.get();
        System.out.println(tourtureResult);
    }

}
