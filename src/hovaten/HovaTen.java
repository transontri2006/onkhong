/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hovaten;

/**
 *
 * @author Macbook
 */
import java.util.Scanner;

public class HovaTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho va ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap ma so sinh vien: ");
        String mssv = sc.nextLine();

        System.out.println("----- THONG TIN SINH VIEN -----");
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Ma so sinh vien: " + mssv);
    }
}