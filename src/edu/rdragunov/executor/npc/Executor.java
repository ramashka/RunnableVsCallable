package edu.rdragunov.executor.npc;

import edu.rdragunov.executor.data.NpcName;
import edu.rdragunov.executor.data.TourtureResult;
import edu.rdragunov.executor.data.factories.nameGenerator.ExecutorNameGenerator;
import edu.rdragunov.executor.data.factories.nameGenerator.NameGenerator;

import java.util.concurrent.Callable;

/**
 * Created by Rrr on 04.06.2016.
 */
public class Executor implements Runnable, Callable<TourtureResult>{
    private final static NameGenerator executorNameGenerator=new ExecutorNameGenerator();
    private User tourtureUser;
    private NpcName name;
    private TourtureResult tourtureResult;

    public Executor(User user){
        name = executorNameGenerator.generateName();
        tourtureUser = user;
        tourtureResult=new TourtureResult(user,this);
    }

    public User getTourtureUser() {
        return tourtureUser;
    }

    public void setTourtureUser(User tourtureUser) {
        this.tourtureUser = tourtureUser;
        tourtureResult=new TourtureResult(tourtureUser,this);
    }


    public NpcName getName() {
        return name;
    }

    public void setName(NpcName name) {
        this.name = name;
    }

    private TourtureResult startTourture(){
        long start=System.currentTimeMillis();
        while (tourtureUser.getHp()>User.MIN_HP_TO_GET_THE_SECRET){
            tourtureUser.tourture(1);
        }
        tourtureResult.setSecretInformation(tourtureUser.getSecretInformation());
        tourtureResult.setTourturedTime(System.currentTimeMillis()-start);
        return tourtureResult;
    }

    public TourtureResult getTourtureResult() {
        return tourtureResult;
    }

    @Override
    public void run() {
        startTourture();
    }

    @Override
    public TourtureResult call() throws Exception {
        return startTourture();
    }
}
