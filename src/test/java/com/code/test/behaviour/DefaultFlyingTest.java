package com.code.test.behaviour;

import static org.junit.Assert.*;

public class DefaultFlyingTest {

    @org.junit.Test
    public void fly() {
     org.junit.Assert.assertEquals("I am flying",DefaultFlying.INSTANCE.fly());
    }
}
