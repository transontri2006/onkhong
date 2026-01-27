/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5_loops;

/**
 *
 * @author Macbook
 */
import java.util.Scanner;

public class baitapmoinhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Vòng lặp ngoài điều kiện
        for(int i = 1;i <= 5;i++) {
            for(int j = 1;j <= i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
