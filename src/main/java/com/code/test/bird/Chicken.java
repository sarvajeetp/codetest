package com.code.test.bird;

import com.code.test.animal.Animal;
import com.code.test.behaviour.DefaultWalking;
import com.code.test.behaviour.Sound;
import com.code.test.behaviour.Walking;

public class Chicken implements Animal, Sound, Walking {
    public Chicken(){
    }

    @Override
    public String make_sound() {
        String sound = "Cluck, cluck";
        System.out.println(sound);
        return sound;
    }

    @Override
    public String walk() {
        return DefaultWalking.INSTANCE.walk();
    }

    @Override
    public String toString(){
        return "Chicken";
    }

}
