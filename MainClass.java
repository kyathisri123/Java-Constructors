package Constructors;

class MultipleConstructors {
    MultipleConstructors() {
        System.out.println("Default Constructor");
    }

    MultipleConstructors(int a) {
        System.out.println("One Argument Constructor: " + a);
    }

    MultipleConstructors(int a, String b) {
        System.out.println("Two Argument Constructor: " + a + ", " + b);
    }
}

public class MainClass {
    public static void main(String[] args) {
        new MultipleConstructors(); 
        new MultipleConstructors(10);
        new MultipleConstructors(20, "Java");
    }
}

