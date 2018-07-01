package com.code.test.fish;

import org.junit.Before;
import org.junit.Test;

public class ClownFishTest {
    ClownFish clownFish;
    @Before
    public void setup(){
        clownFish = new ClownFish();
    }

    @Test
    public void swim() {
        org.junit.Assert.assertEquals("I am swimming",clownFish.swim());
    }

    @Test
    public void make_joke() {
        org.junit.Assert.assertEquals("I am joking",clownFish.make_joke());
    }

}