package com.code.test.behaviour;

public class DefaultSoundTest {

    @org.junit.Test
    public void make_sound() {
     org.junit.Assert.assertEquals("No Sound",DefaultSound.INSTANCE.make_sound());
    }
}
