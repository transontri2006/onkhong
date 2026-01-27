
package uanhunao;

import java.util.Scanner;

public class sauqua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot chuoi:");
        String input = scanner.nextLine();
        String result = input.trim().replaceAll("\\s+"," ");
        System.out.println("Chuoi sau khi xu ly:" + result);
        
        scanner.close();
    }
    
}
