package com.code.test.animal;

import com.code.test.behaviour.DefaultWalking;
import com.code.test.behaviour.Sound;
import com.code.test.behaviour.Walking;

public class Cat implements Animal, Walking, Sound {
    @Override
    public String make_sound() {
        return "Meow";
    }

    @Override
    public String walk() {
        return DefaultWalking.INSTANCE.walk();
    }
}
