
package nhieubaigoplai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Random;

public class Nhieubaigoplai {
    public static void main(String[] args) {


        ArrayList<Integer> bai1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            bai1.add(i);
        }
        System.out.println("Bai 1: " + bai1);


        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.set(1, "Yellow");
        System.out.println("Bai 2: " + colors);


        ArrayList<Double> prices = new ArrayList<>();
        prices.add(10.5);
        prices.add(20.0);
        prices.add(30.75);
        System.out.println("Bai 3:");
        for (double p : prices) {
            System.out.println(p);
        }


        ArrayList<String> cities = new ArrayList<>();
        cities.add("Hanoi");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("Paris");
        cities.add("Sydney");
        System.out.println("Bai 4: Co London khong? " + cities.contains("London"));


        ArrayList<Integer> random10 = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            random10.add(rd.nextInt(100) + 1);
        }
        random10.remove(3);
        System.out.println("Bai 5: " + random10);


        ArrayList<Integer> random15 = new ArrayList<>();
        int chan = 0, le = 0;
        for (int i = 0; i < 15; i++) {
            int num = rd.nextInt(50) + 1;
            random15.add(num);
            if (num % 2 == 0) {
                chan++;
            } else {
                le++;
            }
        }
        System.out.println("Bai 6: " + random15);
        System.out.println("So chan: " + chan + ", So le: " + le);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Collections.reverse(list);
        System.out.println(list);


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grape");
        ArrayList<String> copyFruits = new ArrayList<>(fruits);
        System.out.println("Bai 8: " + fruits);
        System.out.println("Ban sao: " + copyFruits);


        ArrayList<Integer> listBai9 = new ArrayList<>();
        list.add(12);
        list.add(45);
        list.add(7);
        list.add(89);
        list.add(23);
        System.out.println("Bai 9 - Max: " + Collections.max(list));
        System.out.println("Bai 9 - Min: " + Collections.min(list));


        ArrayList<String> names = new ArrayList<>();
        names.add("Tri");
        names.add("Hoang");
        names.add("Tri");
        names.add("Huy");
        names.add("Hoang");
        Set<String> uniqueNames = new LinkedHashSet<>(names);
        System.out.println("Bai 10: " + uniqueNames);
        ArrayList<Integer> bai11 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            bai11.add(rd.nextInt(100) + 1);
        }
        System.out.println("Bai 11: " + bai11);
        System.out.println("Max: " + Collections.max(bai11));
        System.out.println("Min: " + Collections.min(bai11));
        ArrayList<Integer> bai12 = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int num = rd.nextInt(100) + 1;
            bai12.add(num);
            sum += num;
        }
        System.out.println("Bai 12: " + bai12);
        System.out.println("Tong: " + sum);
    }
}
