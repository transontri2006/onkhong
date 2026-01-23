/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec4_ce;

/**
 *
 * @author Macbook
 */
import java.util.Scanner;

public class Lec4_ce {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What percentage did you earn? ");
        int percent = scanner.nextInt();

        if (percent >= 90) {
            System.out.println("You got an A!");
        } else if (percent >= 80) {
            System.out.println("You got a B!");
        } else if (percent >= 70) {
            System.out.println("You got a C!");
        } else if (percent >= 60) {
            System.out.println("You got a D!");
        } else if (percent >= 50) {
            System.out.println("You got an E!");
        } else {
            System.out.println("You got an F!");
        }

        scanner.close();
    }
}
