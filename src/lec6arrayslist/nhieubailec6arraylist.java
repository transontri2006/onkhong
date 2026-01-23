/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec6arrayslist;

import java.util.Scanner;
import java.util.ArrayList;

public class nhieubailec6arraylist {

    public static void main(String[] args) {
        ArrayList<String> dsSinhVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Nhap 5 ten sinh vien:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Sinh vien" + (i + 1) + ":");
            dsSinhVien.add(scanner.nextLine());
        }
        System.out.println(
                "Danh sach sinh vien vua nhap:");
    }
}
