/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scholarship;

/**
 *
 * @author Macbook
 */
import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Co hoc bong khong (true/false): ");
        boolean scholarship = sc.nextBoolean();

        System.out.println("Scholarship: " + scholarship);
    }
}

