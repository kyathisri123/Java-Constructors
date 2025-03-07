package Constructors;

class MultipleConstructorCalls {
    MultipleConstructorCalls() {
        System.out.println("Constructor Called");
    }

    void callConstructor() {
        // We cannot explicitly call a constructor again on the same object
        // But we can simulate it by creating a new object
        new MultipleConstructorCalls();
    }

    public static void main(String[] args) {
        MultipleConstructorCalls obj = new MultipleConstructorCalls();
        obj.callConstructor();  // Creating a new object to "simulate" multiple constructor calls
        obj.callConstructor();
    }
}

