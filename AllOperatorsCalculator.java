import java.util.Scanner;

public class AllOperatorsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("=== All Arithmetic Operations Calculator ===");

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Arithmetic operations
        System.out.println("\n--- Results ---");
        System.out.println("Addition (a + b)       : " + (a + b));
        System.out.println("Subtraction (a - b)    : " + (a - b));
        System.out.println("Multiplication (a * b) : " + (a * b));

        if (b != 0) {
            System.out.println("Division (a / b)       : " + (a / b));
            System.out.println("Modulus (a % b)        : " + (a % b));
        } else {
            System.out.println("Division and Modulus by zero is not allowed.");
        }

        // Demonstrating increment and decrement
        int inc = a;
        int dec = b;

        System.out.println("Pre-Increment (++a)    : " + (++inc));
        System.out.println("Post-Increment (a++)   : " + (inc++));
        System.out.println("After Post-Increment   : " + inc);

        System.out.println("Pre-Decrement (--b)    : " + (--dec));
        System.out.println("Post-Decrement (b--)   : " + (dec--));
        System.out.println("After Post-Decrement   : " + dec);

        sc.close();
    }
}
