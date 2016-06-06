package edu.rdragunov.executor.data.factories.nameGenerator;

import edu.rdragunov.executor.data.NpcName;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Rrr on 04.06.2016.
 */
public class UserMaleNameGenerator implements NameGenerator{
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
        t.add("Добрый");
        t.add("Милый");
        t.add("Няшный");
        t.add("Чоткий");
        t.add("Щедрый");
        t.add("Яркий");
        t.add("Целый");
        t.add("Здоровый");
        t.add("Рыжий");
        t.add("Конопатый");
        t.add("Веселый");
        t.add("Люк");
        t.add("Дарт");
        t.add("Анакин");
        return t;

    }

    private static List<String> generateLastNames() {
        List<String> t = new LinkedList<>();
        t.add("Гарри");
        t.add("Добряк");
        t.add("Мишкинс");
        t.add("Поцик");
        t.add("Щедряк");
        t.add("Рыжик");
        t.add("Весельчак");
        t.add("У");
        t.add("Ы");
        t.add("Щедряк");
        t.add("Визли");
        t.add("Скайвокер");
        t.add("Ведйер");
        t.add("Поттер");
        return t;
    }

}
