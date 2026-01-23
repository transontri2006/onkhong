/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitrenlop;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class bai9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(18);
        list.add(27);
        list.add(36);
        list.add(48);
        list.add(90);

        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
            
 
