/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xuantri;

/**
 *
 * @author Macbook
 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Xuantri {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho va ten: ");
        String name = sc.nextLine();

        System.out.print("Nhap studentID: ");
        String studentID = sc.nextLine();

        System.out.print("Nhap hometown: ");
        String hometown = sc.nextLine();

        System.out.print("Nhap major: ");
        String major = sc.nextLine();

        System.out.print("Nhap QPA: ");
        float qpa = sc.nextFloat();
        sc.nextLine();

        System.out.print("Nhap ngay sinh (dd-MM-yyyy): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dayOfBirth = LocalDate.parse(sc.nextLine(), formatter);

        System.out.print("Co hoc bong khong (true/false): ");
        boolean scholarship = sc.nextBoolean();

        System.out.println("----- THONG TIN SINH VIEN -----");
        System.out.println("Ho va ten: " + name);
        System.out.println("StudentID: " + studentID);
        System.out.println("Hometown: " + hometown);
        System.out.println("Major: " + major);
        System.out.println("QPA: " + qpa);
        System.out.println("Ngay sinh: " + dayOfBirth);
        System.out.println("Scholarship: " + scholarship);

        sc.close();
    }
}

