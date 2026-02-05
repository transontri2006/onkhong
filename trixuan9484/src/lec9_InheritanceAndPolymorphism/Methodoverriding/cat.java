package lec9_InheritanceAndPolymorphism.Methodoverriding;

public class cat extends Animal {

    @Override
     void makeSound() {
        System.out.println("Meows meows");
    }
}
