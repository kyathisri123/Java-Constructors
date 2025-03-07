package Constructors;

class AccessModifierConstructors {
    private AccessModifierConstructors() {
        System.out.println("Private Constructor");
    }

    public AccessModifierConstructors(int a) {
        System.out.println("Public Constructor: " + a);
    }

    protected AccessModifierConstructors(String b) {
        System.out.println("Protected Constructor: " + b);
    }

    AccessModifierConstructors(double c) {
        System.out.println("Default Constructor: " + c);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        new AccessModifierConstructors(10);    // Public
        new AccessModifierConstructors("Hello");  // Protected
        new AccessModifierConstructors(20.5);  // Default

        // Private constructor cannot be accessed outside the class
        new AccessModifierConstructors(); // Allowed here because it's the same class
    }
}

