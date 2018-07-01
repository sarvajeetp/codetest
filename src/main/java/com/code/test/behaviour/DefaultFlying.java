package com.code.test.behaviour;

public enum DefaultFlying {
    INSTANCE;

    public String fly(){
        String flying = "I am flying";
        System.out.println(flying);
        return flying;
    }
}
