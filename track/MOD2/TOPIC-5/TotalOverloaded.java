
import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {
        return first + second;
    }

    int getTotal(int first, int second, int third) {
        return first + second + third;
    }
}

public class TotalOverloaded {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        ResultCalculator calculator = new ResultCalculator();

        int twoTotal = calculator.getTotal(first, second);
        int threeTotal = calculator.getTotal(first, second, third);

        System.out.println("Two-Mark Total: " + twoTotal);
        System.out.println("Three-Mark Total: " + threeTotal);
    }
}
