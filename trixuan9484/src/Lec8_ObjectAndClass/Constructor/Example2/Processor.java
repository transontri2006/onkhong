package Lec8_ObjectAndClass.Constructor.Example2;

public class Processor {

    public static void main(String[] args) {
        Student s1 = new Student(111, "Karan");
        Student s2 = new Student(222, "Aryan", 25);

        s1.display();
        s2.display();
    }
}
    

