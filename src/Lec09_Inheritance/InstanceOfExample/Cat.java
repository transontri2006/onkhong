package Lec09_Inheritance.InstanceOfExample;

public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meows meows");
    }
}
