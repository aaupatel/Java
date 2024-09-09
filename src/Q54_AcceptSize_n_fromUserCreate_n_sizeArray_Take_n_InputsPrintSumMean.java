import java.util.Scanner;

public class Q54_AcceptSize_n_fromUserCreate_n_sizeArray_Take_n_InputsPrintSumMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        int mean = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Enter " + (i+1) + " element");
            arr[i] = sc.nextInt();
            if (i == 0) {
                mean = arr[i];
            } else if (mean > arr[i]) {
                mean = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);
        System.out.println("Mean = " + mean);
    }
}
