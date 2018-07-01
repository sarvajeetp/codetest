package com.code.test.Insect;

import com.code.test.behaviour.DefaultFlying;
import com.code.test.behaviour.Flying;

public class Butterfly implements Insect, Flying {
    private Caterpillar caterpillar;

    public Butterfly(Caterpillar caterpillar){
        this.caterpillar = caterpillar;
    }

    @Override
    public String fly() {
        return DefaultFlying.INSTANCE.fly();
    }

    @Override
    public String toString(){
        return "Butterfly";
    }

}
