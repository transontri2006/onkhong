/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitrenlop;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class bai6 {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        int chan = 0;
        int le = 0;
        for(int i = 0;i<15;i++) {
            int num = rd.nextInt(50)+1;
            list.add(num);
            
            if(num % 2 == 0) {
                chan++;
            } else {
                le++;
            }
        }
        System.out.print("Danh sach so:" + list);
        System.out.print("So chan:" + chan);
        System.out.print("So le:" + le);
        }
    }

