package edu.rdragunov.executor.data.factories.nameGenerator;

import edu.rdragunov.executor.data.NpcName;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Rrr on 04.06.2016.
 */
public class ExecutorNameGenerator implements NameGenerator{
    private final static List<String> firstNameList= generateFirstNames();
    private final static List<String> lastNameList = generateLastNames();

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
        t.add("Грязный");
        t.add("Потный");
        t.add("Хитрый");
        t.add("Быстрый");
        t.add("Мелкопакостный");
        t.add("Скрытный");
        t.add("Тихий");
        t.add("Хилый");
        t.add("Мелкий");
        t.add("Кровожадный");
        t.add("Кровавый");
        t.add("Мутный");
        t.add("Вонючий");
        return t;

    }

    private static List<String> generateLastNames() {
        List<String> t = new LinkedList<>();
        t.add("Гарри");
        t.add("Мачо");
        t.add("Пончик");
        t.add("Мякиш");
        t.add("Геральт");
        t.add("Вельзевул");
        t.add("Джо");
        t.add("Ватсон");
        t.add("Шерлок");
        t.add("Пиксель");
        return t;
    }
}
