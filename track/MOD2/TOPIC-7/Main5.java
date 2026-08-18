import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] values = new int[5];

        // Read five values
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextInt();
        }

        int total = 0;

        // Calculate total
        for (int i = 0; i < values.length; i++) {
            total = total + values[i];
        }

        System.out.println("Total: " + total);
    }
}