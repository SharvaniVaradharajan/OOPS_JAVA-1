import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BankAccountBufferedReader {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader to take input
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to Simple Bank Account Setup");

        System.out.print("Enter your name: ");
        String name = reader.readLine();  // reads a full line

        System.out.print("Enter your account number: ");
        String accountNumber = reader.readLine();  // read as string to preserve leading zeros

        System.out.print("Enter your opening balance: ");
        double balance = Double.parseDouble(reader.readLine());  // convert string to double

        // Output the entered details
        System.out.println("\n--- Account Created Successfully ---");
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number     : " + accountNumber);
        System.out.println("Opening Balance    : Rs " + balance);
    }
}
