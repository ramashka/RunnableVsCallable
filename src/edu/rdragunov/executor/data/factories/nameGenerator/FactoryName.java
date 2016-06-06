package edu.rdragunov.executor.data.factories.nameGenerator;

import edu.rdragunov.executor.data.NpcName;

/**
 * Created by Rrr on 04.06.2016.
 */
public class FactoryName {

    public static NpcName generateExecutorName(){
        return KnownGeneratorTypes.EXECUTOR_NAME_GENERATOR.generateName();
    }

    public static NpcName generateUserMaleName(){
        return KnownGeneratorTypes.USER_MALE_NAME_GENERATOR.generateName();
    }
    public static NpcName generateUserFemaleName(){
        return KnownGeneratorTypes.USER_FEMALE_NAME_GENERATOR.generateName();
    }
    public static NpcName generateCustomName(NameGenerator nameGenerator){
        return nameGenerator.generateName();
    }

    public static enum KnownGeneratorTypes implements NameGenerator{
        EXECUTOR_NAME_GENERATOR(new ExecutorNameGenerator()),
        USER_MALE_NAME_GENERATOR(new UserMaleNameGenerator()),
        USER_FEMALE_NAME_GENERATOR(new UserFemaleNameGenerator());

        private NameGenerator nameGenerator;

        KnownGeneratorTypes(NameGenerator nameGenerator){
            this.nameGenerator=nameGenerator;
        }

        @Override
        public NpcName generateName() {
            return this.nameGenerator.generateName();
        }
    }
}
