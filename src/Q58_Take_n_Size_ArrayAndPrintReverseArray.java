import java.util.Arrays;
import java.util.Scanner;

public class Q58_Take_n_Size_ArrayAndPrintReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array = " + Arrays.toString(arr));

        int[] temp = new int[size];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            temp[j] = arr[i];
        }

        // Other Method using while
//        int i = arr.length - 1;
//        int j = 0;
//        while (i >= 0) {
//            temp[j++] = arr[i--];
//        }

        System.out.println("Reverse Array = " + Arrays.toString(temp));
    }
}
