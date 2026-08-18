class ArraySearch {
    void search(int ref[], int key) {
        boolean found = false;
        for (int i = 0; i < ref.length; i++) {
            if (ref[i] == key) {
                System.out.println("Element found at index : " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found...");
        }
    }
}

public class Main8 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        ArraySearch as = new ArraySearch();
        as.search(a, 40);
    }
}