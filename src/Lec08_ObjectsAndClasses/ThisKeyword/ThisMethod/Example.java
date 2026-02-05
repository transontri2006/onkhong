package Lec08_ObjectsAndClasses.ThisKeyword.ThisMethod;

public class Example {

    void method() {
        System.out.println("method is invoked");
    }

    void callMethod() {
        this.method();
    }

    public static void main(String[] args) {
        Example e = new Example();
        e.callMethod();
    }
}
