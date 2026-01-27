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

public class baivonglap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number (-1 to quit): ");
        int number = scanner.nextInt();
        
        while (number != -1) {
            sum = sum + number; //moved to top of loop
            System.out.print("Enter a number (-1 to quit): ");
            number = scanner.nextInt();
        }
        System.out.println("The total is " + sum);
    }
}
 
