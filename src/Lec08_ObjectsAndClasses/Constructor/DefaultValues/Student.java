package Lec08_ObjectsAndClasses.Constructor.DefaultValues;

public class Student {

    int id;
    String name;

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}  

