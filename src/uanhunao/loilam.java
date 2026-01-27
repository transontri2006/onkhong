
package uanhunao;

import java.util.Scanner;

public class loilam {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao dem so chuoi:");
        String s = scanner.nextLine();
        if(s == null || s.trim().isEmpty()) {
            System.out.println("So tu 0");
        } else {
            String[] words = s.trim().split("\\s+");
            System.out.println("So tu"+ words.length);
        }
    }
}
            

