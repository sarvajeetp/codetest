package com.code.test.behaviour;

public enum DefaultSinging {
    INSTANCE;

    public String sing() {
        String singing = "I am singing";
        System.out.println(singing);
        return singing;
    }
}
