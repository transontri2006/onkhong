package Lec8_ObjectAndClass.ThisKeyword.Constructor;

public class Student {

    int id;
    String name;

    Student() {
        System.out.println("default constructor is invoked");
    }

    Student(int id, String name) {
        this(); // gọi constructor mặc định
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}
    

