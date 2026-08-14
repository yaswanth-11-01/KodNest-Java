
import java.util.Scanner;

public class StudentObject {

    static class Student {

        int id;
        String name;
        String course;
        double javaScore;

        Student(int id, String name, String course, double javaScore) {
            this.id = id;
            this.name = name;
            this.course = course;
            this.javaScore = javaScore;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        String course = sc.next();
        double javaScore = sc.nextDouble();

        Student student = new Student(id, name, course, javaScore);

        System.out.println("Student Profile");
        System.out.println("ID: " + student.id);
        System.out.println("Name: " + student.name);
        System.out.println("Course: " + student.course);
        System.out.println("Java Score: " + student.javaScore);

        sc.close();
    }
}
