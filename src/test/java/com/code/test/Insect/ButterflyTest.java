package com.code.test.Insect;

import com.code.test.fish.Shark;
import org.junit.Before;
import org.junit.Test;

public class ButterflyTest {
    Butterfly butterfly;
    @Before
    public void setup(){
        Caterpillar caterpillar = new Caterpillar();
        butterfly = new Butterfly(caterpillar);
    }

    @Test
    public void fly() {
        org.junit.Assert.assertEquals("I am flying",butterfly.fly());
    }
}
