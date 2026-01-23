/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitrenlop;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;


public class bai11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for(int i = 0;i<10;i++) {
            list.add(rd.nextInt(100)+1);
        }
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
            
  
