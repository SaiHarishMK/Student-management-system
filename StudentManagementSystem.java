import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Enrollment> enrollments = new ArrayList<>();

    // Methods to add, remove, and manage students and courses

    public void addStudent() {
        // Logic to add a new student
    }

    public void viewAllStudents() {
        for (Student student : students) {
            student.displayInfo();
        }
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);
        // Main menu logic to call addStudent(), viewAllStudents(), etc.
    }
}
