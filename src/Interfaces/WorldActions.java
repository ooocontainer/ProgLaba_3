package Interfaces;

import enums.enumWorld;

public interface WorldActions {


    void through(enumWorld wrd);

    void moveTo(enumWorld wrd);
    void brakeStatus(enumWorld wrd);
    void beBeaty(enumWorld wrd);
    void stood(enumWorld wrd);
    void whitenessStatus(enumWorld wrd);
    void reflection(enumWorld wrd1,enumWorld wrd2);

}
