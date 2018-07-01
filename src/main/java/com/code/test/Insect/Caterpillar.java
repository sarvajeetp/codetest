package com.code.test.Insect;

import com.code.test.animal.Cat;
import com.code.test.behaviour.Walking;

public class Caterpillar implements Insect, Walking {
    public Caterpillar(){
        System.out.println("I'm Caterpillar");
    }

    @Override
    public String walk() {
        String crawling = "I am crawling";
        System.out.println(crawling);
        return crawling;
    }
}
