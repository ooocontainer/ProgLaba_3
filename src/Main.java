import objects.*;
import enums.*;

public class Main {
    public static void main (String[] args){


        Person they = new Person("Они");
        WorldObj obj = new WorldObj();


        they.run();
        obj.through(enumWorld.HOLM);
        obj.through(enumWorld.LILAC_BUSHES);
        obj.moveTo(enumWorld.PORCH);
        they.stay();
        they.mute();
        obj.brakeStatus(enumWorld.RAILINGS);
        obj.beBeaty(enumWorld.SUNFLOWER);
        obj.stood(enumWorld.BARREL);
        obj.whitenessStatus(enumWorld.HAMMOCK);
        obj.reflection(enumWorld.PUDDLE,enumWorld.SKY);

    }
}