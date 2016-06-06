package edu.rdragunov.executor.data.factories.secretInformationGenerator;

import edu.rdragunov.executor.data.factories.nameGenerator.FactoryName;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Rrr on 04.06.2016.
 */
public class MaleSecretInformationGenerator implements SecretInformationGenerator {
    private List<String> maleSecretInformations = generateMaleSecrets();


    @Override
    public String generateSecretInformation() {
        return maleSecretInformations.get(ThreadLocalRandom.current().nextInt(maleSecretInformations.size()));
    }

    private List<String> generateMaleSecrets(){
        List<String> list=new LinkedList<>();
        list.add(ThreadLocalRandom.current().nextInt(1000)+1000 + " золотых что лежат в подвале его дома");
        list.add(ThreadLocalRandom.current().nextInt(1000)+1000 + " золотых что покоятся на чердаке его дома");
        list.add(ThreadLocalRandom.current().nextInt(1000)+1000 +" золотых что зарыты в склепе его люимой бабушки");
        list.add("готовящийся государственный переворот");
        list.add("то что его соседка " + FactoryName.generateUserFemaleName() + " до смерти боится щекотки");
        list.add("то что его сосед " + FactoryName.generateUserMaleName() + " до смерти боится мышей");
        list.add("то что красная армия всех сильней");
        list.add("то что дядюшка макДональдс плюет в гамбургеры");
        list.add("то что " + FactoryName.generateUserFemaleName() + " проститутка и наркоманка, потому что не здоровается с бабушками у подъезда");
        list.add("то что " + FactoryName.generateUserMaleName() + " козел, потому что у него самая крутая последняя 'iLoshadz-7turbo'");
        list.add("то что хватит жрать на ночь глядя");
        list.add("то что его жена не умеет лепить пельмени");
        list.add("то что его начальник " + FactoryName.generateUserMaleName() + " козел");
        list.add("то что его начальница " + FactoryName.generateUserFemaleName() + " строит ему глазки");
        list.add("то что его сотрудник " + FactoryName.generateUserFemaleName() + " удачливый пройдоха");
        list.add("то как его все достало и он хочет в отпуск");
        list.add("грязные финансовые махинации его начальника");
        list.add("скорый обвал цен на шерсть");
        list.add("то что его не ценят на работе и скоро он уволится нафиг");
        list.add("то что он целыми днями сидит в социальной сети 'вНаработе' ничего не делает, а ему за это платят деньги");
        list.add("то что ему очень нравится девушка по имени " + FactoryName.generateUserFemaleName());
        list.add("то что ему очень нравится парень по имени " + FactoryName.generateUserMaleName());
        list.add("технические характеристики еще не анонсированной модели 'iLoshadz-8'");
        list.add("Геральта из Ривии, оказывается он - ведьмак");
        list.add("Секретный рецепт тибетских монахов который позволяет увеличить пинус на " + ThreadLocalRandom.current().nextInt(50)+50 + "%");
        return list;
    }
}
