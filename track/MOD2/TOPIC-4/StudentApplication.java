
class Student {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

public class StudentApplication {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 26;
        s1.name = "yaswanth";
        s1.height = 6.0;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();

        Student s2 = new Student();
        s2.roll = 28;
        s2.name = "Ram";
        s2.height = 6.0;
        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.height);
        s2.run();
        s2.sleep();
    }
}
