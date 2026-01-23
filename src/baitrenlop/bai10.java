/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitrenlop;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        names.add("Tri");
        names.add("Hoang");
        names.add("Khang");
        names.add("Huy");
        names.add("Long");
        Set<String> set = new LinkedHashSet<>(names);
        names.clear();
        names.addAll(set);
        System.out.println(names);
    }
}

