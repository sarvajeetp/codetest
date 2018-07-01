package com.code.test.Insect;

import com.code.test.behaviour.DefaultFlying;
import com.code.test.behaviour.Flying;

public class Butterfly implements Insect, Flying {
    private Caterpillar caterpillar;

    public Butterfly(Caterpillar caterpillar){
        System.out.println("Caterpillar became Butterfly");
        this.caterpillar = caterpillar;
    }

    @Override
    public String fly() {
        return DefaultFlying.INSTANCE.fly();
    }
}
