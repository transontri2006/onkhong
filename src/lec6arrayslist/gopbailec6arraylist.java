/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec6arrayslist;

import java.util.ArrayList;
import java.util.Scanner;

public class gopbailec6arraylist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> so = new ArrayList<>();
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap gia tri: ");
            so.add(scanner.nextInt());
        }
        for (int i=0;i<so.size();i++){
            if(so.get(i)%2!=0){
                System.out.print(so.get(i));
            }
        }
    }
}
