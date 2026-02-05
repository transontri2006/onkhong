package Lec09_Inheritance.RuntimePoly_DataMember;

public class PolymorphismExample {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        System.out.println("Source: " + animal.source);
    }
}
