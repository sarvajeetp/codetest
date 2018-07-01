package com.code.test.cilent;

import com.code.test.animal.Cat;
import com.code.test.animal.Dog;
import com.code.test.bird.*;
import com.code.test.fish.ClownFish;
import com.code.test.fish.Dolphin;
import com.code.test.fish.Shark;
import com.code.test.nonliving.Phone;

public class Solution {
    /* So Instead of Initializing Bird, which is general class. I would rather instatiate
     * specialized Bird class for e.g. Parrot
    */
    public static void main(String[] args) {
        Bird parrot = new Parrot();
        parrot.fly();
        parrot.walk();
        ((Parrot)parrot).sing();
        System.out.println();

        Chicken chicken = new Chicken();
        chicken.make_sound();
        System.out.println();

        Duck duck = new Duck();
        duck.swim();
        duck.make_sound();
        System.out.println();

        Rooster rooster = new Rooster(chicken);
        rooster.make_sound();
        System.out.println();

        Parrot parrot_near_cat = new Parrot(new Cat());
        parrot_near_cat.make_sound();
        System.out.println();

        Parrot parrot_near_dog = new Parrot(new Dog());
        parrot_near_dog.make_sound();
        System.out.println();

        Parrot parrot_near_duck = new Parrot(new Duck());
        parrot_near_duck.make_sound();
        System.out.println();

        Parrot parrot_near_phone = new Parrot(new Phone());
        parrot_near_phone.make_sound();
        System.out.println();

        ClownFish clownFish = new ClownFish();
        clownFish.make_joke();
        System.out.println("ClownFish size is "+clownFish.getSize());
        System.out.println("ClownFish color is "+clownFish.getColor());
        System.out.println();

        Shark shark = new Shark();
        System.out.println("Shark size is "+shark.getSize());
        System.out.println("Shark color is "+shark.getColor());

        Dolphin dolphin = new Dolphin();
        dolphin.swim();
        System.out.println();

    }

}
