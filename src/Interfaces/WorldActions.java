package Interfaces;

import enums.enumWorld;
import objects.Person;

public interface WorldActions {



    void through(enumWorld wrd, enumWorld wrd1, enumWorld wrd2);

    void moveTo(enumWorld wrd);
    void brakeStatus(enumWorld wrd);
    void beBeaty(enumWorld wrd);
    void stood(enumWorld wrd);
    void whitenessStatus(enumWorld wrd);
    void reflection(enumWorld wrd1,enumWorld wrd2);

    void fitStatus(enumWorld wrd, Person person);
    void likeBefore();
}
