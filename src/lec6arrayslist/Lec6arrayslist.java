/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lec6arrayslist;


import java.util.Arrays;
import java.util.ArrayList;


public class Lec6arrayslist {
    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList <>();
        names.add("Huy1");
        names.add("Huy2");
        names.add("Huy3");
        System.out.println(names.get(0));
        //remove by object and return Boolean type
        System.out.println(names.remove("Huy2"));
        
        //remove by index
        System.out.println(names.remove(1));
        System.out.println(Arrays.toString(names.toArray()));
    }
}


