package com.code.test.nonliving;

import com.code.test.behaviour.Sound;

import java.net.Socket;

public class Phone implements Sound {
    public Phone(){
        System.out.println("I'm Phone");
    }

    @Override
    public String make_sound() {
        String phone_bell = "Trin, trin";
        System.out.println(phone_bell);
        return phone_bell;
    }
}
