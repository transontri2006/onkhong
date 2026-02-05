
package lec9inheritone;


public class Husky extends Dog {
    void displayInformation() {
        super.displayPrice(); // gọi method của class cha
        System.out.println("Husky's price is 1500 USD");
    }
}
    

