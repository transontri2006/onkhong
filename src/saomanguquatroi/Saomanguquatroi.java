/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saomanguquatroi;

import java.util.Random;
import java.util.Scanner;

public class Saomanguquatroi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("===== MENU =====");
        System.out.println("1. BT1: So nguyen ngau nhien 1-100");
        System.out.println("2. BT2: So thuc ngau nhien 1-8");
        System.out.println("3. BT3: 5 so nguyen bat ky (3-80), tim so chan le");
        System.out.println("4. BT4: Nhap so 1-100, kiem tra nho/bang/lon 10-100");
        System.out.println("5. BT5: So sanh so nhap voi so ngau nhien 1-10");
        System.out.println("6. BT6: Game doan so 1-100");
        System.out.print("Chon bai (1-6): ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int n1 = rand.nextInt(100) + 1;
                System.out.println("So nguyen ngau nhien: " + n1);
                break;

            case 2:
                double n2 = 1 + rand.nextDouble() * 7;
                System.out.println("So thuc ngau nhien: " + n2);
                break;

            case 3:
                System.out.println("5 so ngau nhien tu 3 den 80:");
                for (int i = 0; i < 5; i++) {
                    int x = rand.nextInt(78) + 3;
                    if (x % 2 == 0)
                        System.out.println(x + " la so chan");
                    else
                        System.out.println(x + " la so le");
                }
                break;

            case 4:
                System.out.print("Nhap so (1-100): ");
                int n4 = sc.nextInt();
                if (n4 < 10)
                    System.out.println("Nho hon 10");
                else if (n4 <= 100)
                    System.out.println("Trong khoang 10-100");
                else
                    System.out.println("Lon hon 100");
                break;

            case 5:
                int random = rand.nextInt(10) + 1;
                System.out.print("Nhap so (1-10): ");
                int n5 = sc.nextInt();
                System.out.println("So ngau nhien: " + random);

                if (n5 == random)
                    System.out.println("Ban doan DUNG");
                else
                    System.out.println("Ban doan SAI");
                break;

            case 6:
                int secret = rand.nextInt(100) + 1;
                int guess;

                do {
                    System.out.print("Nhap so ban doan (1-100): ");
                    guess = sc.nextInt();

                    if (guess < secret)
                        System.out.println("Nho hon");
                    else if (guess > secret)
                        System.out.println("Lon hon");
                    else
                        System.out.println("CHINH XAC! Ban da doan dung");
                } while (guess != secret);
                break;

            default:
                System.out.println("Lua chon khong hop le!");
        }

        sc.close();
    }
}



