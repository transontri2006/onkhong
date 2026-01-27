/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworkcalculator;

/**
 *
 * @author Macbook
 */
import java.util.Scanner;

public class HomeworkCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nhập số a
        System.out.print("Input a: ");
        int a = input.nextInt();

        // Nhập số b
        System.out.print("Input b: ");
        int b = input.nextInt();

        // Nhập toán tử
        System.out.print("Input the operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        // Xử lý tính toán bằng switch-case
        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    // Ép kiểu sang double để có kết quả chính xác
                    System.out.println(a + " / " + b + " = " + ((double) a / b));
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }
}
