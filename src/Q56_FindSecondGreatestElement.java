import java.util.Arrays;
import java.util.Scanner;

public class Q56_FindSecondGreatestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            arr[i] = sc.nextInt();
        }
        int first = Math.max(arr[0], arr[1]);
        int second = Math.min(arr[0], arr[1]);
        for (int i = 2; i < size; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                second = arr[i];
            }
        }
        System.out.println("Array = " + Arrays.toString(arr));
        System.out.println("Second Greatest Element = " + second);
    }
}
