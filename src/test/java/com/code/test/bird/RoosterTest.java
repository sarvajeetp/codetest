package com.code.test.bird;

import org.junit.Before;
import org.junit.Test;

public class RoosterTest {
    Rooster rooster;

    @Before
    public void setup(){
        Chicken chicken = new Chicken();
        rooster =  new Rooster(chicken);
    }

    @Test
    public void walk() {
        org.junit.Assert.assertEquals("I am walking",rooster.walk());
    }

    @Test
    public void make_sound() {
        org.junit.Assert.assertEquals("Cock-a-doodle-doo",rooster.make_sound());
    }
}