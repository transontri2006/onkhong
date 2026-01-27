
package uanhunao;

import java.util.Scanner;

public class eoai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi goc:");
        String text = scanner.nextLine();
        System.out.print("Nhap tu can thay the:");
        String oldWord = scanner.nextLine();
        System.out.print("Nhap tu thay the:");
        String newWord = scanner.nextLine();
        String updatedText = text.replace(oldWord,newWord); 
        System.out.println("Chuoi moi: " + updatedText);
    }
}
        


