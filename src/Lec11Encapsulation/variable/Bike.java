
package Lec11Encapsulation.variable;


final class Bike {
     void run() {
        System.out.println("running safely with 100kmph");
    }
}

class Honda extends Bike {
    public static void main(String args[]) {
        Honda honda = new Honda();
        honda.run();
    }
}
    

