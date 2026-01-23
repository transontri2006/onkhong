/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec6arrayslist;

import java.util.Scanner;
import java.util.ArrayList;

public class baimoilec6 {
    static Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Nhap so luong phan tu:");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print("Phan tu [" + i + "]:");
            list.add(scanner.nextInt());
        }
        System.out.println("\nA.Danh sach phan tu:" + list);
        hienThiChan(list);
        tinhTong(list);
        xoaPhanTu(list);
    }

    
    
    public static void hienThiChan(ArrayList<Integer> list) {
        int count = 0;
        System.out.print("B. Cac so chan va vi tri (index): ");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.print(list.get(i) + "(index " + i + ") ");
                count++;
            }
        }
        System.out.println("\n   => Co tat ca " + count + " so chan.");
    }

    public static void tinhTong(ArrayList<Integer> list) {
        int tong = 0;
        for (int so : list) {
            tong += so;
        }
        System.out.println("C. Tong cac gia tri: " + tong);
    }

    public static void xoaPhanTu(ArrayList<Integer> list) {
        System.out.print("D. Nhap gia tri can xoa: ");
        // Bây giờ biến scanner đã được nhận biết ở đây
        int giaTriXoa = scanner.nextInt();
        
        boolean daXoa = list.removeIf(n -> n == giaTriXoa);
        
        if (daXoa) {
            System.out.println("   => Da xoa. Danh sach moi: " + list);
        } else {
            System.out.println("   => Khong tim thay gia tri " + giaTriXoa + " trong danh sach.");
        }
    }
}

    
    

