package baitaplec6trenlop;

import java.util.Scanner;
import java.util.Arrays;

public class baitieptheolec6 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();
        int[] temps = new int[days];
        int sum = 0;

        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + "'s high temp: ");
            temps[i] = console.nextInt(); // Lưu giá trị vào mảng
            sum += temps[i];
        }
        double average = (double) sum / days;
        int count = 0;
        for (int i = 0; i < temps.length; i++) { // Sử dụng thuộc tính .length
            if (temps[i] > average) {
                count++;
            }
        }
        System.out.printf("Average temp = %.1f\n", average);
        System.out.println(count + " days were above average.");

        System.out.println("Temperatures: " + Arrays.toString(temps));

        Arrays.sort(temps);
        System.out.print(Arrays.toString(temps));

        System.out.println("Two coldest days: " + temps[0] + ", " + temps[1]);
        System.out.println("Two hottest days: " + temps[temps.length - 1] + ", " + temps[temps.length - 2]);
    }
}
