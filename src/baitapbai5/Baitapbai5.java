/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapbai5;

import java.util.Scanner;

public class Baitapbai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number (-1 to quit): ");
            number = scanner.nextInt();

            if (number != -1) {
                sum = sum + number;
            }
        } while (number != -1);

        System.out.println("The total is " + sum);
    }
}               
        

