package com.code.test.behaviour;

public class DefaultSingingTest {

    @org.junit.Test
    public void sing() {
     org.junit.Assert.assertEquals("I am singing",DefaultSinging.INSTANCE.sing());
    }
}
