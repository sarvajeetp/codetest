package com.code.test.Insect;

import org.junit.Before;
import org.junit.Test;

public class CaterPillarTest {
    Caterpillar caterpillar;
    @Before
    public void setup(){
        caterpillar = new Caterpillar();
    }

    @Test
    public void walk() {
        org.junit.Assert.assertEquals("I am crawling",caterpillar.walk());
    }
}
