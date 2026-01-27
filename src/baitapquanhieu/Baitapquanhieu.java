/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapquanhieu;

/**
 *
 * @author Macbook
 */
import java.util.Scanner;

public class Baitapquanhieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập tọa độ x
        System.out.print("Nhập hoành độ x: ");
        double x = sc.nextDouble();

        // Nhập tọa độ y
        System.out.print("Nhập tung độ y: ");
        double y = sc.nextDouble();

        // Gọi hàm kiểm tra và in kết quả
        phanLoaiGocPhanTu(x, y);
    }

    public static void phanLoaiGocPhanTu(double x, double y) {
        if (x > 0 && y > 0) {
            System.out.println("Điểm (" + x + ", " + y + ") thuộc góc phần tư thứ I");
        } else if (x < 0 && y > 0) {
            System.out.println("Điểm (" + x + ", " + y + ") thuộc góc phần tư thứ II");
        } else if (x < 0 && y < 0) {
            System.out.println("Điểm (" + x + ", " + y + ") thuộc góc phần tư thứ III");
        } else if (x > 0 && y < 0) {
            System.out.println("Điểm (" + x + ", " + y + ") thuộc góc phần tư thứ IV");
        } else if (x == 0 && y == 0) {
            System.out.println("Điểm nằm tại gốc tọa độ O");
        } else if (x == 0) {
            System.out.println("Điểm nằm trên trục tung Oy");
        } else {
            System.out.println("Điểm nằm trên trục hoành Ox");
        }
    }
}
