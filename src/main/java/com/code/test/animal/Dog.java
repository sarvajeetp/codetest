package com.code.test.animal;

import com.code.test.behaviour.DefaultWalking;
import com.code.test.behaviour.Sound;
import com.code.test.behaviour.Walking;

public class Dog implements Animal, Walking, Sound {

    @Override
    public String make_sound() {
        return "Woof, woof";
    }

    @Override
    public String walk() {
        return DefaultWalking.INSTANCE.walk();
    }

    @Override
    public String toString(){
        return "Dog";
    }

}
