package com.code.test.bird;

import com.code.test.behaviour.DefaultFlying;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParrotTest {
    Parrot parrot;
    @Before
    public void setup(){
        parrot = new Parrot();
    }

    @Test
    public void fly() {
        org.junit.Assert.assertEquals("I am flying",parrot.fly());
    }

    @Test
    public void walk() {
        org.junit.Assert.assertEquals("I am walking",parrot.walk());
    }

    @Test
    public void sing() {
        org.junit.Assert.assertEquals("I'm singing 'Rihana, rihana'",parrot.sing());
    }

    @Test
    public void make_sound_with_rooster() {
        parrot.setAccompaniedAnimal(new Rooster(new Chicken()));
        org.junit.Assert.assertEquals("Cock-a-doodle-doo",parrot.make_sound());
    }

    @Test
    public void make_sound_with_duck() {
        parrot.setAccompaniedAnimal(new Duck());
        org.junit.Assert.assertEquals("Quack, quack",parrot.make_sound());
    }

    @Test
    public void make_sound_default() {
        org.junit.Assert.assertEquals("I'm singing 'Rihana, rihana'",parrot.make_sound());
    }
}