/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitrenlop;

import java.util.ArrayList;

public class baisao {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Red");
        list.add("Black");
        list.add("White");
        list.add("Grey");

        list.set(1, "Yellow");

        System.out.print("Danh sach mau :");
        for (String color : list) {
            System.out.print(color + "");
        }
    }
}
