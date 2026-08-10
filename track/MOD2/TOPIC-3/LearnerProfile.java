
import java.util.Scanner;

public class LearnerProfile {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first name:");
            String name = sc.next();
            System.out.println("Learner: " + name);

            System.out.println("Enter the solvedProblems:");
            int num = sc.nextInt();
            System.out.println("Problems solved: " + num);

            System.out.println("Enter the assessmentPercentage:");
            double d = sc.nextDouble();
            System.out.println("Assessment: " + d);
        }
    }
}
