class Freq {
    int count = 0;
    void count(int arr[], int key) {
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
            System.out.println(key + ": " + count);
        }
    }
public class Main9 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        Freq fs = new Freq();
        fs.count(arr, 40);
    }
}