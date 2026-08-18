public class Main3 {
    public static void main(String[] args) {

        int[] original = { 14, 18, 22, 26 };

        int updateIndex = 1;
        int updatedValue = 25;
        int requestedIndex = 4;

        // Create an independent snapshot
        int[] snapshot = new int[original.length];

        // Copy every element into snapshot
        for (int i = 0; i < original.length; i++) {
            snapshot[i] = original[i];
        }

        // Create a live-view alias
        int[] liveView = original;

        // Update through liveView
        liveView[updateIndex] = updatedValue;

        // Display original
        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        // Display snapshot
        System.out.print("Snapshot: ");
        for (int i = 0; i < snapshot.length; i++) {
            System.out.print(snapshot[i] + " ");
        }
        System.out.println();

        // Check whether both references point to the same array
        System.out.println("Same object: " + (original == liveView));

        // Validate index before accessing the array
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println("Requested value: " + original[requestedIndex]);
        } else {
            System.out.println("Requested value: Invalid index");
        }
    }
}