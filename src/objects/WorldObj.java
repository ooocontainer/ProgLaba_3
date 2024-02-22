package objects;

import Interfaces.*;
import enums.enumWorld;
public class WorldObj implements WorldActions {

    @Override
    public void through(enumWorld wrd) {
        System.out.println("Через " + wrd.getDescription());
    }

    @Override
    public void moveTo(enumWorld wrd) {
        System.out.println("К " + wrd.getDescription());
    }

    @Override
    public void brakeStatus(enumWorld wrd) {
        System.out.println(wrd.getDescription() + " не сломались");
    }

    @Override
    public void beBeaty(enumWorld wrd) {
        System.out.println(wrd.getDescription() + " был красивым");
    }

    @Override
    public void stood(enumWorld wrd) {
        System.out.println(wrd.getDescription() + " стояла");
    }

    @Override
    public void whitenessStatus(enumWorld wrd) {
        System.out.println(wrd.getDescription() + " посветлел");
    }

    @Override
    public void reflection(enumWorld wrd1,enumWorld wrd2) {
        System.out.println("В " + wrd1.getDescription() + " отражалось " + wrd2.getDescription());
    }
}
