package Constructors;

class ConstructorWithReturnType {
    // A constructor should not have a return type; this is incorrect.
    int ConstructorWithReturnType() {
        System.out.println("Constructor with return type int");
        return 10;
    }

    String ConstructorWithReturnType(String msg) {
        System.out.println("Constructor with return type String");
        return msg;
    }

    public static void main(String[] args) {
        ConstructorWithReturnType obj = new ConstructorWithReturnType();
        int result = obj.ConstructorWithReturnType();
        String text = obj.ConstructorWithReturnType("Hello");

        System.out.println("Result: " + result);
        System.out.println("Text: " + text);
    }
}

