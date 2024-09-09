import java.util.Scanner;

public class Q55_FindGreatestElementPrintItsIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int greatest = 0;
        int index = -1;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i + 1) + " element");
            arr[i] = sc.nextInt();
            if (i == 0) {
                greatest = arr[i];
                index = i;
            } else if (greatest < arr[i]) {
                greatest = arr[i];
                index = i;
            }
        }
        System.out.println(greatest + " element found at index " + index);
    }
}
