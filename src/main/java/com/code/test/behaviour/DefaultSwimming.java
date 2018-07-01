package com.code.test.behaviour;

public enum DefaultSwimming {
    INSTANCE;

    public String swim() {
        String swimming = "I am swimming";
        System.out.println(swimming);
        return swimming;
    }
}