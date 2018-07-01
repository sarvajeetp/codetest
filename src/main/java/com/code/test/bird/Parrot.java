package com.code.test.bird;

import com.code.test.behaviour.*;

public class Parrot implements Bird, Singing, Sound {
    public void setAccompaniedAnimal(Sound accompaniedAnimal) {
        this.accompaniedAnimal = accompaniedAnimal;
    }

    private Sound accompaniedAnimal;

    public Parrot(){
        System.out.println("I'm Parrot");
    }

    public Parrot(Sound accompaniedAnimal){
        this.accompaniedAnimal = accompaniedAnimal;
    }

    public String fly() {
        return DefaultFlying.INSTANCE.fly();
    }

    public String walk() {
        return DefaultWalking.INSTANCE.walk();
    }

    public String sing() {
        String singing = "I'm singing 'Rihana, rihana'";
        System.out.println(singing);
        return singing;
    }

    @Override
    public String make_sound() {
        return (accompaniedAnimal != null?accompaniedAnimal.make_sound():this.sing());
    }
}
