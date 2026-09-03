import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        int palindrome = 1;

        while (left < right) {

            if (arr[left] != arr[right]) {
                palindrome = 0;
                break;
            }

            left++;
            right--;
        }

        System.out.println(palindrome);

        sc.close();
    }
}