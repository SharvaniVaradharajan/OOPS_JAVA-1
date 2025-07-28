import java.util.Scanner;

public class StudentProfile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Student Profile and Grading System ===");

        // String (non-primitive)
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // byte (age between 0 to 127)
        System.out.print("Enter age (byte): ");
        byte age = sc.nextByte();

        // short (can be used for student ID)
        System.out.print("Enter student ID (short): ");
        short studentId = sc.nextShort();

        // int (marks in 3 subjects)
        System.out.print("Enter marks in subject 1 (int): ");
        int mark1 = sc.nextInt();
        System.out.print("Enter marks in subject 2 (int): ");
        int mark2 = sc.nextInt();
        System.out.print("Enter marks in subject 3 (int): ");
        int mark3 = sc.nextInt();

        // long (mobile number, realistic use)
        System.out.print("Enter contact number (long): ");
        long contact = sc.nextLong();

        // float (attendance percentage)
        System.out.print("Enter attendance percentage (float): ");
        float attendance = sc.nextFloat();

        // char (grade will be calculated)
        char grade;

        // double (for average calculation)
        double average = (mark1 + mark2 + mark3) / 3.0;

        // boolean (pass or fail based on average)
        boolean isPass = average >= 35;

        // grade logic (char)
        if (average >= 90) grade = 'A';
        else if (average >= 75) grade = 'B';
        else if (average >= 60) grade = 'C';
        else if (average >= 35) grade = 'D';
        else grade = 'F';

        // Output all data
        System.out.println("\n--- Student Profile ---");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Student ID     : " + studentId);
        System.out.println("Marks          : " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Average Marks  : " + average);
        System.out.println("Attendance     : " + attendance + "%");
        System.out.println("Contact Number : " + contact);
        System.out.println("Pass Status    : " + (isPass ? "PASS" : "FAIL"));
        System.out.println("Grade          : " + grade);

        sc.close();
    }
}
