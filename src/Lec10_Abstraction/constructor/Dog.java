
package Lec10_Abstraction.constructor;


public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public void makeSound() {
        System.out.println("Barks barks");
    }
}

