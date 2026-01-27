/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bailec6;

import java.util.*;

public class baitaplec6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        // 1. Hỏi số ngày và khởi tạo mảng
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();
        int[] temps = new int[days]; // Khai báo mảng với độ dài do người dùng nhập
        int sum = 0;

        // 2. Vòng lặp để nhập nhiệt độ và tính tổng
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = console.nextInt(); // Lưu giá trị vào mảng
            sum += temps[i];
        }

        // 3. Tính toán nhiệt độ trung bình
        double average = (double) sum / days;

        // 4. Đếm số ngày có nhiệt độ cao hơn mức trung bình
        int count = 0;
        for (int i = 0; i < temps.length; i++) { // Sử dụng thuộc tính .length
            if (temps[i] > average) {
                count++;
            }
        }

        // 5. In kết quả cuối cùng ra màn hình
        System.out.printf("Average temp = %.1f\n", average);
        System.out.println(count + " days were above average.");
    }
}
