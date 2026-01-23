/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec6.arrays;

import java.util.Scanner;

public class bai2lec6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int tong = n * (n + 1) / 2;
        System.out.println("Tong tu 1 den " + n + " = " + tong);
    }
}

