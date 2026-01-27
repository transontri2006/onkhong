/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapbai5;

import java.util.Random;

public class lamsao {
    public static void main(String[] args) {
        Random rand = new Random();
        int tong = 0;
        int soLanTung = 0;

        do {
            int xucXac1 = rand.nextInt(6) + 1;
            int xucXac2 = rand.nextInt(6) + 1;

            tong = xucXac1 + xucXac2;
            soLanTung++;

            System.out.println(xucXac1 + " + " + xucXac2 + " = " + tong);
        } while (tong != 7);

        System.out.println("Bạn đã thắng sau " + soLanTung + " lần thử!");
    }
}


     
    

