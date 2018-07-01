package com.code.test.cilent;

import com.code.test.Insect.Butterfly;
import com.code.test.Insect.Caterpillar;
import com.code.test.Insect.Insect;
import com.code.test.animal.Animal;
import com.code.test.animal.Cat;
import com.code.test.animal.Dog;
import com.code.test.behaviour.Flying;
import com.code.test.behaviour.Singing;
import com.code.test.behaviour.Swimming;
import com.code.test.behaviour.Walking;
import com.code.test.bird.*;
import com.code.test.fish.ClownFish;
import com.code.test.fish.Dolphin;
import com.code.test.fish.Fish;
import com.code.test.fish.Shark;
import com.code.test.nonliving.Phone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    /* So Instead of Initializing Bird, which is general class. I would rather instatiate
     * specialized Bird class for e.g. Parrot
    */
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{new Duck(), new Parrot()};
        Fish[] fishes = new Fish[]{new ClownFish(), new Shark()};
        Insect[] insects = new Insect[]{new Caterpillar(), new Butterfly(new Caterpillar())};
        Animal[] specializedAnimals = new Animal[]{new Rooster(new Chicken()), new Chicken(),new Dolphin(), new Cat(), new Dog()};
        List<Object> list = Arrays.asList(birds, fishes, insects, specializedAnimals).stream().flatMap(animal -> Arrays.stream(animal)).
                collect(Collectors.toList());

        List swimmingAnimals = list.stream().filter(o -> (o instanceof Animal && o instanceof Swimming)).collect(Collectors.toList());
        List flyingAnimals = list.stream().filter(o -> (o instanceof Animal && o instanceof Flying)).collect(Collectors.toList());
        List singingAnimals = list.stream().filter(o -> (o instanceof Animal && o instanceof Singing)).collect(Collectors.toList());
        List walkingAnimals = list.stream().filter(o -> (o instanceof Animal && o instanceof Walking)).collect(Collectors.toList());
        System.out.println("List of swimming animals: "+swimmingAnimals);
        System.out.println("No of swimming animals: "+swimmingAnimals.size());
        System.out.println("List of flying animals: "+flyingAnimals);
        System.out.println("No of flying animals: "+flyingAnimals.size());
        System.out.println("List of singing animals: "+singingAnimals);
        System.out.println("No of singing animals: "+singingAnimals.size());
        System.out.println("List of walking animals: "+walkingAnimals);
        System.out.println("No of walking animals: "+walkingAnimals.size());

    }

}
