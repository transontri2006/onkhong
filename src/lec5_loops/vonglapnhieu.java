/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5_loops;

import java.util.Scanner;

public class vonglapnhieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase;
        do  {
            System.out.print("Type your password: ");
            phrase = scanner.next();
        } while(!phrase.equals("duytan"));
    }
}

