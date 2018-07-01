package com.code.test.bird;

import com.code.test.animal.Animal;
import com.code.test.behaviour.Flying;
import com.code.test.behaviour.Walking;

public interface Bird extends Animal, Walking, Flying {
}
