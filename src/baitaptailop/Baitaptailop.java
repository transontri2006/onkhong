/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitaptailop;

/**
 *
 * @author Macbook
 */
import java.util.Scanner;

public class Baitaptailop {

    // Ham tim so lon nhat
    public static int findMaxNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        if (a == b) {
            System.out.println("Please enter a != b");
        } else {
            System.out.println("Max number: " + findMaxNumber(a, b));
        }

        scanner.close();
    }
}