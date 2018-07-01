package com.code.test.behaviour;

public enum DefaultSound {
    INSTANCE;

    public String make_sound(){
        String sound = "No Sound";
        System.out.println(sound);
        return sound;
    }
}
