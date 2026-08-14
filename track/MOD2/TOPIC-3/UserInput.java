
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Integer = " + num);

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        System.out.println("Double = " + d);

        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();
        System.out.println("Float = " + f);

        System.out.print("Enter a long value: ");
        long l = sc.nextLong();
        System.out.println("Long = " + l);

        System.out.print("Enter a short value: ");
        short s = sc.nextShort();
        System.out.println("Short = " + s);

        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();
        System.out.println("Byte = " + b);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println("Character = " + ch);

        System.out.print("Enter a boolean: ");
        boolean g = sc.nextBoolean();
        System.out.println("Boolean = " + g);

        sc.close();
    }
}
