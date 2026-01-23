/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitrenlop;

import java.util.Scanner;
import java.util.ArrayList;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        list1.add("Mango");
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        System.out.println(list1);
        System.out.println(list2);
    }
}
        

