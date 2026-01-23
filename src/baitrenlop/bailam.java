/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitrenlop;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class bailam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>   numbers = new ArrayList<>();
        Random rd = new Random();
        for(int i = 0;i<10;i++) {
            int x = rd.nextInt(100)+1;
            numbers.add(x);
        }
        System.out.println(numbers);
    }
}
            
    
