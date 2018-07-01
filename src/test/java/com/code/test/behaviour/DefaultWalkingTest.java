package com.code.test.behaviour;

public class DefaultWalkingTest {

    @org.junit.Test
    public void walk() {
     org.junit.Assert.assertEquals("I am walking",DefaultWalking.INSTANCE.walk());
    }
}
