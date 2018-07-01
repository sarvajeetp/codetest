package com.code.test.fish;

import org.junit.Before;
import org.junit.Test;

public class DolphinTest {
    Dolphin dolphin;
    @Before
    public void setup(){
        dolphin = new Dolphin();
    }

    @Test
    public void swim() {
        org.junit.Assert.assertEquals("I am a good swimmer",dolphin.swim());
    }

}