package com.code.test.behaviour;

public enum DefaultWalking {
    INSTANCE;

    public String walk() {
        String walking = "I am walking";
        System.out.println(walking);
        return walking;
    }
}
