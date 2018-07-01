package com.code.test.bird;

import com.code.test.behaviour.*;

public class Duck implements Bird, Swimming, Sound {
    public Duck(){
    }

    @Override
    public String fly() {
        return DefaultFlying.INSTANCE.fly();
    }

    @Override
    public String swim() {
        return DefaultSwimming.INSTANCE.swim();
    }

    @Override
    public String walk() {
        return DefaultWalking.INSTANCE.walk();
    }

    @Override
    public String make_sound() {
        String sound = "Quack, quack";
        System.out.println(sound);
        return sound;
    }

    @Override
    public String toString(){
        return "Duck";
    }

}
