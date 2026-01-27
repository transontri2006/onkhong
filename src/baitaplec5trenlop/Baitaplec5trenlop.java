/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitaplec5trenlop;

import java.util.Random;
import java.util.Scanner;

public class Baitaplec5trenlop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("--- BAT DAU CHUONG TRINH ---");

        
        System.out.print("BT1 - Nhap khoang so nguyen (min max): ");
        int min1 = scanner.nextInt();
        int max1 = scanner.nextInt();
        int bt1 = random.nextInt(max1 - min1 + 1) + min1;
        System.out.println("Ket qua BT1: " + bt1);

       
        System.out.print("BT2 - Nhap khoang so thuc (min max, vi du 1.8 8.0): ");
        double min2 = scanner.nextDouble();
        double max2 = scanner.nextDouble();
        double bt2 = min2 + (max2 - min2) * random.nextDouble();
        System.out.printf("Ket qua BT2: %.2f\n", bt2);

       
        System.out.print("BT3 - Nhap khoang kiem tra chan le (min max): ");
        int min3 = scanner.nextInt();
        int max3 = scanner.nextInt();
        int bt3 = random.nextInt(max3 - min3 + 1) + min3;
        String loai = (bt3 % 2 == 0) ? "Chan" : "Le";
        System.out.println("Ket qua BT3: So " + bt3 + " la so " + loai);

        
        System.out.print("BT4 - Thiet lap khoang so thuc ngau nhien (min max): ");
        double min4 = scanner.nextDouble();
        double max4 = scanner.nextDouble();
        double random4 = min4 + (max4 - min4) * random.nextDouble();
        System.out.print("Nhap so thuc ban muon so sanh: ");
        double nhap4 = scanner.nextDouble();
        if (nhap4 > random4) {
            System.out.printf("Ket qua BT4: %.2f > %.2f (Lon hon)\n", nhap4, random4);
        } else if (nhap4 < random4) {
            System.out.printf("Ket qua BT4: %.2f < %.2f (Nho hon)\n", nhap4, random4);
        } else {
            System.out.printf("Ket qua BT4: %.2f = %.2f (Bang nhau)\n", nhap4, random4);
        }

        
        System.out.print("BT5 - Thiet lap khoang doan so (min max): ");
        int min5 = scanner.nextInt();
        int max5 = scanner.nextInt();
        int random5 = random.nextInt(max5 - min5 + 1) + min5;
        int nhap5, dem5 = 0;
        System.out.println("Bat dau doan so trong khoang " + min5 + "-" + max5);
        do {
            System.out.print("Nhap so: ");
            nhap5 = scanner.nextInt();
            dem5++;
        } while (nhap5 != random5);
        System.out.println("Chinh xac! Ban doan dung sau " + dem5 + " lan.");

       
        System.out.print("BT6 - Thiet lap khoang cho tro choi (min max): ");
        int min6 = scanner.nextInt();
        int max6 = scanner.nextInt();
        int random6 = random.nextInt(max6 - min6 + 1) + min6;
        int nhap6;
        System.out.println("Tro choi bat dau! Hay tim so may man.");
        while (true) {
            System.out.print("Nhap so doan: ");
            nhap6 = scanner.nextInt();
            if (nhap6 == random6) {
                System.out.println("Chuc mung! Ban da doan dung.");
                break;
            } else if (nhap6 < random6) {
                System.out.println("Goi y: Lon hon");
            } else {
                System.out.println("Goi y: Nho hon");
            }
        }

        System.out.println("--- HOAN THANH TAT CA BAI TAP ---");
        scanner.close();
    }
}
