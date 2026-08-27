// Q1: Demonstrate method definition, parameters, and return values
public class MethodsDemo {

    // Method with return value
    static int square(int n) {
        return n * n;
    }

    // Method with no return value
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Recursive method: factorial
    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        greet("Developer");
        System.out.println("Square of 6: " + square(6));
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
