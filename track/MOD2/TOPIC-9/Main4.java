import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        
        long target = sc.nextLong();
        
        int start = 0;
        long currentSum = 0;
        
        for (int end = 0; end < n; end++) {
            currentSum += arr[end];
            
            
            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }
            
            
            if (currentSum == target && start <= end) {
                System.out.println(start + " " + end);
                return;
            }
        }
        
        System.out.println(-1);
    }
}