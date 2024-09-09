import java.util.Arrays;
import java.util.Scanner;

public class Q59_ArrayLeftRotationBy1One {
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

        int temp = arr[0];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = temp;
        System.out.println("Array with 1 Rotation = " + Arrays.toString(arr));
    }
}
