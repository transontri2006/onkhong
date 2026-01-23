/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec6arrayslist;

import java.util.Scanner;
import java.util.ArrayList;

public class baitailoplec6array {
    public static void main(String[] args) {
        ArrayList<Double> dsSoThuc = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 7 so thuc: ");
        for(int i = 0;i < 7;i++) {
            System.out.println("So thu"+(i + 1)+":");
            dsSoThuc.add(scanner.nextDouble());
        }
        System.out.println("Danh sach so thuc:" + dsSoThuc);
    }
}
  