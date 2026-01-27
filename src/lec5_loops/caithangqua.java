/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lec5_loops;

/**
 *
 * @author Macbook
 */
import java.util.Scanner;

public class caithangqua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Vòng lặp 
        int num = 1;
        while (num <= 200) {
            System.out.print(num + " ");
            num = num * 2;
        }
    }
}
