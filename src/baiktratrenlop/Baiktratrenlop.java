/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baiktratrenlop;

import java.util.Scanner;
public class Baiktratrenlop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // Tạo đối tượng nhập dữ liệu

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();                   // Nhập số n từ bàn phím

        int dem = 0;                                 // Biến đếm số lượng
        int tong = 0;                                // Biến tính tổng

        for (int i = 3; i <= n; i++) {               // Lặp từ 3 đến n
            if (i % 3 == 0 && i % 5 == 0) {           // Chia hết cho 3 và 5
                dem++;                               // Tăng biến đếm
                tong += i;                           // Cộng i vào tổng
            }
        }

        System.out.println("So luong = " + dem);
        System.out.println("Tong = " + tong);
    }
}

    


