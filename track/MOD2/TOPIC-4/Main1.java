
import java.util.Scanner;

class Student {

    // Declare registrationId, name and attendancePercentage
    int registrationId;
    String name;
    double attendancePercentage;
}

public class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create and populate first Student
        Student firstStudent = new Student();
        firstStudent.registrationId = scanner.nextInt();
        firstStudent.name = scanner.next();
        firstStudent.attendancePercentage = scanner.nextDouble();

        // Create and populate second Student
        Student secondStudent = new Student();
        secondStudent.registrationId = scanner.nextInt();
        secondStudent.name = scanner.next();
        secondStudent.attendancePercentage = scanner.nextDouble();

        // Read the selected ID and new attendance
        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        // Initially no student is selected
        Student selectedStudent = null;

        // Make selectedStudent refer to the matching existing object
        if (selectedId == firstStudent.registrationId) {
            selectedStudent = firstStudent;
        } else if (selectedId == secondStudent.registrationId) {
            selectedStudent = secondStudent;
        }

        // Update through selectedStudent when a match exists
        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;

            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        // Display both records
        System.out.printf("%d - %s - %.1f%%%n",
                firstStudent.registrationId,
                firstStudent.name,
                firstStudent.attendancePercentage);

        System.out.printf("%d - %s - %.1f%%%n",
                secondStudent.registrationId,
                secondStudent.name,
                secondStudent.attendancePercentage);

        scanner.close();
    }
}
