package com.code.test.cilent;

import com.code.test.bird.Bird;
import com.code.test.bird.Parrot;

public class Solution {
    /* So Instead of Initializing Bird, which is general class. I would rather instatiate
     * specialized Bird class for e.g. Parrot
    */
    public static void main(String[] args) {
        Bird parrot = new Parrot();
        parrot.fly();
        parrot.walk();
        ((Parrot)parrot).sing();
    }

}
