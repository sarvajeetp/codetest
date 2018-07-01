package com.code.test.bird;

import org.junit.Before;
import org.junit.Test;

public class DuckTest {
    Duck duck;
    @Before
    public void setup(){
        duck = new Duck();
    }

    @Test
    public void walk() {
        org.junit.Assert.assertEquals("I am walking",duck.walk());
    }

    @Test
    public void make_sound() {
        org.junit.Assert.assertEquals("Quack, quack",duck.make_sound());
    }

    @Test
    public void fly() {
        org.junit.Assert.assertEquals("I am flying",duck.fly());
    }

    @Test
    public void swim() {
        org.junit.Assert.assertEquals("I am swimming",duck.swim());
    }

}