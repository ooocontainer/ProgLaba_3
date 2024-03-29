package objects;

import Interfaces.*;
public class Person extends AbsObj implements Actions{
    public Person(String name,String decName) {
        super(name,decName);
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " бежали");
    }

    @Override
    public void stay() {
        System.out.println(this.getName() + " остановились");
    }

    @Override
    public void mute() {
        System.out.println(this.getName() + " молчали");
    }


    @Override
    public void feelsBetter() {
        System.out.println(this.getDecName() + " словно гора с плеч");
    }

}
