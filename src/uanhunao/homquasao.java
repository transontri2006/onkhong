/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uanhunao;

import java.util.Scanner;

public class homquasao {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        String input = "abc123xyz45";

        String result = input.replaceAll("\\D+", " ").trim();

        System.out.println(result);
    }
}
