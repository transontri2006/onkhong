/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bailec6;

import java.util.Scanner;
import java.util.Arrays;

public class Bailec6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] e = {0,2,4,6,8};
        e[1] = e[3] + e[4];
        System.out.println("e is " + Arrays.toString(e));
    }
}

 
