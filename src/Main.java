import objects.*;
import enums.*;

public class Main {
    public static void main (String[] args){


        Person they = new Person("Они","Им");
        WorldObj obj = new WorldObj();
        Person baby = new Person("малышка Мю","малышке Мю");


        they.run();
        obj.through(enumWorld.HOLM,enumWorld.LILAC_BUSHES,enumWorld.PORCH);
        they.stay();
        they.feelsBetter();
        they.mute();
        obj.likeBefore();
        obj.brakeStatus(enumWorld.RAILINGS);
        obj.beBeaty(enumWorld.SUNFLOWER);
        obj.stood(enumWorld.BARREL);
        obj.whitenessStatus(enumWorld.HAMMOCK);
        obj.reflection(enumWorld.PUDDLE,enumWorld.SKY);
        obj.fitStatus(enumWorld.PUDDLE,baby);

    }
}