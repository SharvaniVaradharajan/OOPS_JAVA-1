import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        // Step 1: Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Step 2: Prompt the user for input
        System.out.println("Welcome to Simple Bank Account Setup");

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Read a line of text

        System.out.print("Enter your account number: ");
        String accountNumber = sc.nextLine(); // Read a long integer

        System.out.print("Enter your opening balance: ");
        double balance = sc.nextDouble(); // Read a decimal number

        // Step 3: Output the data entered
        System.out.println("\n--- Account Created Successfully ---");
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number     : " + accountNumber);
        System.out.println("Opening Balance    : Rs " + balance);

        // Step 4: Close the scanner (good practice)
        sc.close();
    }
}
