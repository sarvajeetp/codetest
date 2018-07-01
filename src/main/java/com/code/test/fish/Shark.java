package com.code.test.fish;

import com.code.test.Atrributes.COLORS;
import com.code.test.Atrributes.SIZE;
import com.code.test.behaviour.DefaultSwimming;

public class Shark implements Fish {
    private SIZE size;
    private COLORS color;
    public Shark(){
        System.out.println("I'm Shark");
        this.size = SIZE.LARGE;
        this.color = COLORS.GREY;
    }

    public Shark(SIZE size, COLORS color){
        this.size = size;
        this.color = color;
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
}
