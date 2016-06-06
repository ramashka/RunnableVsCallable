package edu.rdragunov.executor.data;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Rrr on 04.06.2016.
 */
public class TortureGenerator {
    public final static List<String> tourture_1 = generateTourture_1();
    public final static List<String> tourture_2 = generateTourture_2();
    public final static List<String> tourture_3 = generateTourture_3();

    public static String generateTourture() {
        return getRandomValueFromList(tourture_1)
                + " "
                + getRandomValueFromList(tourture_2)
                + " "
                + getRandomValueFromList(tourture_3);
    }

    private static <T> T getRandomValueFromList(List<T> list) {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }


    private static List<String> generateTourture_1() {
        List<String> t = new LinkedList<>();
        t.add("метода");
        t.add("способа");
        t.add("инструмента");
        t.add("пыточного приспособления");
        t.add("пыток");
        t.add("издевательств");
        return t;

    }

    private static List<String> generateTourture_2() {
        List<String> t = new LinkedList<>();
        t.add("анального");
        t.add("брутального");
        t.add("жестокого");
        t.add("грязного");
        t.add("злого");
        t.add("невероятного");
        t.add("издевательского");
        t.add("доминантного");
        return t;
    }

    private static List<String> generateTourture_3() {
        List<String> t = new LinkedList<>();
        t.add("оскорбления");
        t.add("доминирования и унижения");
        t.add("доминирования");
        t.add("унижения");
        t.add("издевательства");
        t.add("хохота");
        t.add("щекотательства");
        t.add("просмотра санты барбары");
        t.add("просмотра дома 2");
        t.add("просмотра 50 оттенков серого");
        t.add("обхождения");
        t.add("отравления");
        return t;
    }

}
