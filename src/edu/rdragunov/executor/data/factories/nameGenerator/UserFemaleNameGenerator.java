package edu.rdragunov.executor.data.factories.nameGenerator;

import edu.rdragunov.executor.data.NpcName;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Rrr on 04.06.2016.
 */
public class UserFemaleNameGenerator implements NameGenerator{
    public final static List<String> firstNameList= generateFirstNames();
    public final static List<String> lastNameList = generateLastNames();

    @Override
    public NpcName generateName() {
        NpcName name=new NpcName();
        name.setFirstName(getRandomValueFromList(firstNameList));
        name.setLastName(getRandomValueFromList(lastNameList));
        return name;
    }

    private static <T> T getRandomValueFromList(List<T> list) {
        return list.get(ThreadLocalRandom.current().nextInt(list.size()));
    }


    private static List<String> generateFirstNames() {
        List<String> t = new LinkedList<>();
        t.add("Гермиона");
        t.add("Анастейша");
        t.add("Лея");
        t.add("Дженна");
        t.add("Алиса");
        t.add("Саша");
        t.add("Проня");
        return t;

    }

    private static List<String> generateLastNames() {
        List<String> t = new LinkedList<>();
        t.add("Грей");
        t.add("Грейнджер");
        t.add("Скайвокер");
        t.add("Гривз");
        t.add("Джеймсон");
        t.add("Хряпчатая");
        t.add("Тумбатварковая");
        t.add("Серкова");
        t.add("Суркова");
        t.add("Сукова");
        t.add("Светлая");
        t.add("Селезнева");
        return t;
    }

}
