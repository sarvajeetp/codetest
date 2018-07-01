package com.code.test.cilent;

import com.code.test.animal.Cat;
import com.code.test.animal.Dog;
import com.code.test.bird.*;
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

        Chicken chicken = new Chicken();
        chicken.make_sound();

        Duck duck = new Duck();
        duck.swim();
        duck.make_sound();

        Rooster rooster = new Rooster(chicken);
        rooster.make_sound();

        Parrot parrot_near_cat = new Parrot(new Cat());
        parrot_near_cat.make_sound();

        Parrot parrot_near_dog = new Parrot(new Dog());
        parrot_near_dog.make_sound();

        Parrot parrot_near_duck = new Parrot(new Duck());
        parrot_near_duck.make_sound();

        Parrot parrot_near_phone = new Parrot(new Phone());
        parrot_near_phone.make_sound();
    }

}
