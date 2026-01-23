/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitrenlop;

import java.util.ArrayList;
import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        list.add(13);
        list.add(25);
        list.add(34);
        list.add(46);
        list.add(70);
        for(int n : list) {
            sum += n;
        }
        System.out.println(list);
        System.out.println(sum);
    }
}
 
