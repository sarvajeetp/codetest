package com.code.test.behaviour;

public class DefaultSwimmingTest {

    @org.junit.Test
    public void swim() {
     org.junit.Assert.assertEquals("I am swimming",DefaultSwimming.INSTANCE.swim());
    }
}
