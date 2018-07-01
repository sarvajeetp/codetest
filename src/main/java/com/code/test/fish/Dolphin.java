package com.code.test.fish;

import com.code.test.animal.Animal;
import com.code.test.behaviour.Swimming;

public class Dolphin implements Animal, Swimming {
    @Override
    public String swim() {
        String swimming = "I am a good swimmer";
        System.out.println(swimming);
        return swimming;
    }
}
