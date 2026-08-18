public class Main4 {
    public static void main(String[] args) {

        int[] values = {10, 20, 30, 40, 50};
        int bonus = 5;

        // Add bonus to every element
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] + bonus;
        }

        // Print updated values
        System.out.print("Updated values: ");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
    }
} 
