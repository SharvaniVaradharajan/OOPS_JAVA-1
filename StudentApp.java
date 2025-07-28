// File: StudentApp.java

class Student {
    public String name;             // Public: accessible everywhere
    private int age;                // Private: only within Student
    protected String department;    // Protected: same package or subclass
    double cgpa;                    // Default (package-private): same package only

    // Constructor
    public Student(String name, int age, String department, double cgpa) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.cgpa = cgpa;
    }

    // Public method
    public void showPublicInfo() {
        System.out.println("Name (public): " + name);
    }

    // Private method
    private void showPrivateInfo() {
        System.out.println("Age (private): " + age);
    }

    // Protected method
    protected void showProtectedInfo() {
        System.out.println("Department (protected): " + department);
    }

    // Default (package-private) method
    void showDefaultInfo() {
        System.out.println("CGPA (default): " + cgpa);
    }

    // A public method to access the private method
    public void showAllInfo() {
        showPublicInfo();
        showPrivateInfo();
        showProtectedInfo();
        showDefaultInfo();
    }
}

// Another class in the same file (same package)
public class StudentApp {
    public static void main(String[] args) {
        Student s = new Student("Sharvani", 20, "Computer Science", 9.5);

        System.out.println("\n--- Accessing from StudentApp ---");

        // Accessing public member
        System.out.println("Accessing public name: " + s.name);

        // Cannot access private member directly:
        // System.out.println("Accessing private age: " + s.age); ❌

        // Accessing protected and default members (allowed within same package)
        System.out.println("Accessing protected department: " + s.department);
        System.out.println("Accessing default CGPA: " + s.cgpa);

        // Accessing methods
        s.showPublicInfo();
        // s.showPrivateInfo(); ❌ Not allowed
        s.showProtectedInfo();
        s.showDefaultInfo();

        // Safely access all using a public method
        System.out.println("\n--- Using showAllInfo() ---");
        s.showAllInfo();
    }
}
