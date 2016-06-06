package edu.rdragunov.executor.data.factories.secretInformationGenerator;

import edu.rdragunov.executor.data.factories.nameGenerator.FactoryName;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Rrr on 04.06.2016.
 */
public class FemaleSecretInformationGenerator implements SecretInformationGenerator {
    private List<String> femaleSecretInformations= generateFemaleSecrets();


    @Override
    public String generateSecretInformation() {
        return femaleSecretInformations.get(ThreadLocalRandom.current().nextInt(femaleSecretInformations.size()));
    }

    private List<String> generateFemaleSecrets(){
        List<String> list=new LinkedList<>();
        list.add(ThreadLocalRandom.current().nextInt(1000)+1000 + " золотых что лежат в подвале ее дома");
        list.add(ThreadLocalRandom.current().nextInt(1000)+1000 + " золотых что покоятся на чердаке ее дома");
        list.add(ThreadLocalRandom.current().nextInt(1000)+1000 +" золотых что зарыты в склепе ее люимой бабушки");
        list.add("готовящийся государственный переворот");
        list.add("то что ее соседка " + FactoryName.generateUserFemaleName() + " до смерти свекрови");
        list.add("то что ее сосед " + FactoryName.generateUserMaleName() + " до смерти боится тещи");
        list.add("то что мыть котелок нужно только песком торговой марки 'Вася', он также неэффектвен как и более дорогой песок");
        list.add("то что работа в Кери Мэй - это работа вашей мечты");
        list.add("то что " + FactoryName.generateUserFemaleName() + " сука потому что у нее меньше целлюлита");
        list.add("то что " + FactoryName.generateUserMaleName() + " козел, потому что не обращает на неё внимания");
        list.add("то что хватит жрать на ночь глядя");
        list.add("то что её муж хочет аставить её научиться лепить пельмени");
        list.add("то что её начальник " + FactoryName.generateUserMaleName() + " козел, да еще и жентый");
        list.add("то что её начальница " + FactoryName.generateUserFemaleName() + " разведенная стерва и её никто не любит");
        list.add("то что её сотрудник " + FactoryName.generateUserFemaleName() + " бесхребетный мямля, строит её глазки");
        list.add("то что её сотрудник " + FactoryName.generateUserFemaleName() + " козел, потому что не обращает на неё внимания");
        list.add("то как её все достало, она хочет в отпуск, денег, замуж и новую 'iLoshadz-8'");
        list.add("грязные финансовые махинации её начальника");
        list.add("скорый обвал цен на 'iLoshadz-6'");
        list.add("то что её не ценят на работе, и вообще там никто не работает все спят с начальником, а она не спит и её гнобят и лишают премии");
        list.add("то что она целыми днями сидит в социальной сети 'вНаработе' ничего не делает, а её за это платят деньги");
        list.add("то что ей все завидуют и ненавидят, а в особенности " + FactoryName.generateUserFemaleName());
        list.add("то что ей очень нравится парень по имени " + FactoryName.generateUserMaleName());
        list.add("технические характеристики еще не анонсированной модели 'iLoshadz-8', и то как она её хочет");
        list.add("Геральта из Ривии, оказывается он - ведьмак");
        list.add("Господа Бога Нашего, кстати у Вас не найдется минутка поговорить о Нем?");
        return list;
    }
}
