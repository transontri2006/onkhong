
package baitaplec6trenlop;

import java.util.Scanner;

public class bailec6songuyen {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int size = console.nextInt(); 
        int[] numbers = new int[size]; 
        for(int i = 0;i < numbers.length;i++) {
            System.out.print("Nhap gia tri phan tu thu" + (i + 1)+ ":");
            numbers[i] = console.nextInt(); 
            
            
        }
        
    }
        
    
}
