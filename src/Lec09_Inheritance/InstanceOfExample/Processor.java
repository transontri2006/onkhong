package Lec09_Inheritance.InstanceOfExample;

import java.util.ArrayList;

public class Processor {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Cat());
        animals.add(new Dog());

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
    

