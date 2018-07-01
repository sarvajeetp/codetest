package com.code.test.bird;

import com.code.test.animal.Animal;
import com.code.test.behaviour.Sound;
import com.code.test.behaviour.Walking;

public class Rooster implements Animal, Sound, Walking {
    Chicken chicken;
    public Rooster(Chicken chicken){
        System.out.println("I'm Rooster");
        this.chicken = chicken;
    }

    @Override
    public String make_sound(){
        String sound = "Cock-a-doodle-doo";
        System.out.println(sound);
        return sound;
    }

    @Override
    public String walk() {
        return chicken.walk();
    }
}
