package com.code.test.bird;

import com.code.test.behaviour.*;

import java.math.BigDecimal;

public class Parrot implements Bird, Singing {
    public Parrot(){
        System.out.println("I'm Parrot");
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
}
