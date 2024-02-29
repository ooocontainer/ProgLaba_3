package objects;

import Interfaces.*;
import enums.enumWorld;
public class WorldObj implements WorldActions {

    @Override
    public void through(enumWorld wrd, enumWorld wrd1, enumWorld wrd2) {
        System.out.println("Через " + wrd.getDescription() + " через " + wrd1.getDescription() + " к " + wrd2.getDescription());
    }

    @Override
    public void moveTo(enumWorld wrd) {
        System.out.println("К " + wrd.getDescription());
    }

    @Override
    public void brakeStatus(enumWorld wrd) {
        System.out.println("Прекрасные " + wrd.getDescription() + " не сломались");
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
        System.out.println(wrd.getDescription() + " посветлел и " +
                "стал приятного цвет");
    }

    @Override
    public void reflection(enumWorld wrd1,enumWorld wrd2) {
        System.out.println("В " + wrd1.getDescription() + " отражалось " + wrd2.getDescription());
    }

    @Override
    public void fitStatus(enumWorld wrd, Person person) {
        System.out.println(wrd.getDescription() + " годится " + person.getDecName() + " для купания");
    }

    @Override
    public void likeBefore() {
        System.out.println("Все было как прежде");
    }


}
