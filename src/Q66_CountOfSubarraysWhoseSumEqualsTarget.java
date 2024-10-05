import java.util.Arrays;

public class Q66_CountOfSubarraysWhoseSumEqualsTarget {

    public static int countSubarrays(int[] arr, int t) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == t) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int t = 12;
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Number of subarrays with sum " + t + " : " + countSubarrays(arr, t));
    }
}
