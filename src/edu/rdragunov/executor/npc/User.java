package edu.rdragunov.executor.npc;

import edu.rdragunov.executor.data.NpcName;
import edu.rdragunov.executor.data.factories.nameGenerator.NameGenerator;
import edu.rdragunov.executor.data.factories.nameGenerator.UserFemaleNameGenerator;
import edu.rdragunov.executor.data.factories.nameGenerator.UserMaleNameGenerator;
import edu.rdragunov.executor.data.factories.secretInformationGenerator.FemaleSecretInformationGenerator;
import edu.rdragunov.executor.data.factories.secretInformationGenerator.MaleSecretInformationGenerator;
import edu.rdragunov.executor.data.factories.secretInformationGenerator.SecretInformationGenerator;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Rrr on 04.06.2016.
 */
public class User {
    public final static Integer MIN_HP_TO_GET_THE_SECRET=100;
    private NpcName name;
    private Sex sex;
    private String secretInformation;
    private Integer hp=100000000;

    public User(Sex sex){
        this.sex=sex;
        name=sex.generateName();
        secretInformation=sex.generateSecretInformation();
    }

    public NpcName getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public String getSecretInformation() {
        if (!isDead() && hp<=MIN_HP_TO_GET_THE_SECRET){
            return secretInformation;
        }
        return null;

    }

    public Integer getHp() {
        return hp;
    }

    public Integer tourture(Integer strength){
        hp=hp-strength;
        return hp;
    }

    public boolean isDead(){
        return hp<=0;
    }

    public static Sex getRandomSex(){
        return Sex.values()[ThreadLocalRandom.current().nextInt(2)];
    }

    public static enum Sex implements NameGenerator, SecretInformationGenerator{
        MALE(new UserMaleNameGenerator(), new MaleSecretInformationGenerator()),
        FEMALE(new UserFemaleNameGenerator(), new FemaleSecretInformationGenerator());

        private NameGenerator nameGenerator;
        private SecretInformationGenerator secretInformationGenerator;

        Sex(NameGenerator nameGenerator, SecretInformationGenerator secretInformationGenerator){
            this.nameGenerator=nameGenerator;
            this.secretInformationGenerator=secretInformationGenerator;
        }

        @Override
        public String generateSecretInformation() {
            return secretInformationGenerator.generateSecretInformation();
        }


        @Override
        public NpcName generateName() {
            return nameGenerator.generateName();
        }
    }
}
