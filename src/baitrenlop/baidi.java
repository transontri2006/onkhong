/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitrenlop;

import java.util.ArrayList;

public class baidi {

    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(10.6);
        prices.add(12.3);
        prices.add(14.3);
        prices.add(15.7);
        prices.add(16.6);
        for (int i = 0; i < prices.size(); i++) {
            System.out.print("Gia san pham:" + prices.get(i));
        }
    }
}
