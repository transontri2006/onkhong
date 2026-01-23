/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec6.arrays;

import java.util.Scanner;

public class bai3lec6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        int dem = 0;
        System.out.println("Cac so chia het cho 3 va 5 tu 1 den " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                System.out.print(i + " ");
                dem++;
            }
        }

        System.out.println("\nSo luong = " + dem);
    }
}
 
    
    
    

