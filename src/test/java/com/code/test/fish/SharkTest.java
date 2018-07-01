package com.code.test.fish;

import com.code.test.bird.Chicken;
import org.junit.Before;
import org.junit.Test;

public class SharkTest {
    Shark shark;
    @Before
    public void setup(){
        shark = new Shark();
    }

    @Test
    public void swim() {
        org.junit.Assert.assertEquals("I am swimming",shark.swim());
    }

}