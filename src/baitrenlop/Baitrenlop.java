/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitrenlop;


import java.util.ArrayList;

public class Baitrenlop {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("Cac phan tu trong ArrayList:");
        for (int num : list) {
            System.out.print(num + "");
        }
    }
}
