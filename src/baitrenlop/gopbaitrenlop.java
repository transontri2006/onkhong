/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitrenlop;

import java.util.ArrayList;
import java.util.Scanner;

public class gopbaitrenlop {
    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
         String[] thanhpho = new String[5];
         for(int i = 0;i<5;i++) {
             System.out.print("Thanh pho thu" + (i+1)+":");
             list.add(scanner.nextLine());
         }
         System.out.print("\n--- Danh sach 5 thanh pho ban da nhap ---");
         for(int i = 0;i<5;i++) {
             System.out.print((i+1)+"."+thanhpho[i]);
         }
         scanner.close();
    }
}
             
             
             
        
         

