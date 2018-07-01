package com.code.test.bird;

import org.junit.Before;
import org.junit.Test;

public class ChickenTest {
    Chicken chicken;
    @Before
    public void setup(){
        chicken = new Chicken();
    }

    @Test
    public void walk() {
        org.junit.Assert.assertEquals("I am walking",chicken.walk());
    }

    @Test
    public void make_sound() {
        org.junit.Assert.assertEquals("Cluck, cluck",chicken.make_sound());
    }
}