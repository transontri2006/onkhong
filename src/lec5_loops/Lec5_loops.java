/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec5_loops;

/**
 *
 * @author Macbook
 */
import java.util.Scanner;

public class Lec5_loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Vòng lặp ngoài điều khiển số hàng
        for(int i = 1;i <= 5;i++) {
            for(int j = 1;j <= 10;j++) {
                System.out.print("*");
            }
            System.out.println(); //to end the line
        }
    }
}
  
    
    
    
    
    

