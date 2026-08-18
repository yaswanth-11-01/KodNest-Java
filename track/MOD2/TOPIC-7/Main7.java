import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter the elements :");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Array Elements are :");
        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i] + " ");
        }
        int max = a[0];
        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Maximum element is : " + max);
        scanner.close();
    }
}
