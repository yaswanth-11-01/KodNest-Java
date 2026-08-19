import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int minimum = arr[0];
        int maximum = arr[0];

        for (int i = 1; i < size; i++) {

            if (arr[i] < minimum) {
                minimum = arr[i];
            }

            if (arr[i] > maximum) {
                maximum = arr[i];
            }
        }

        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);

        sc.close();
    }
}