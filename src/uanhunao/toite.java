
package uanhunao;

import java.util.Scanner;

public class toite {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi: ");
        String input = scanner.nextLine();
        int count = input.length();
        System.out.println("Tong so ki tu (ke ca khoang trang): " + count);

        scanner.close();
    }
}
 