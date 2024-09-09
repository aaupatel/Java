import java.util.Arrays;
import java.util.Scanner;

public class Q61_ArrayReverseWithoutUsingExtraSpace {
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
        int i = 0, j = size - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reverse Array = " + Arrays.toString(arr));
    }
}
