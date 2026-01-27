
package uanhunao;

import java.util.Scanner;

public class enha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot chuoi:");
        String str = scanner.nextLine();
        System.out.print("Nhap mot ky tu:");
        char ch = scanner.next().charAt(0);
        int count = 0;
        for(int i = 0;i<str.length();i++) {
            if(str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua"+ch+":"+count);
    }
}


