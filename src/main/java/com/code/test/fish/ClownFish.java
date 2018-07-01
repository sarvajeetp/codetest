package com.code.test.fish;

import com.code.test.Atrributes.COLORS;
import com.code.test.Atrributes.SIZE;
import com.code.test.behaviour.DefaultSwimming;

public class ClownFish implements Fish{
    private SIZE size;
    private COLORS color;

    public ClownFish(){
        this.size = SIZE.SMALL;
        this.color = COLORS.ORANGE;
    }

    public String make_joke() {
        String joking = "I am joking";
        System.out.println(joking);
        return joking;
    }

    @Override
    public String swim() {
        return DefaultSwimming.INSTANCE.swim();
    }

    public SIZE getSize() {
        return size;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }

    public COLORS getColor() {
        return color;
    }

    public void setColor(COLORS color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "ClownFish";
    }

}
