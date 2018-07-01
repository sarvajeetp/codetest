package com.code.test.cilent;

import com.code.test.bird.*;

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
    }

}
