
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    int getLuckyNumber() {
        return 7;
    }

    int add(int first, int second) {
        return first + second;
    }
}

public class MethodTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int first = sc.nextInt();
        int second = sc.nextInt();

        MethodDemo m = new MethodDemo();
        m.sayHello();
        m.greet(name);
        System.out.println("Lucky Number: " + m.getLuckyNumber());
        System.out.println("Sum: " + m.add(first, second));
    }
}
