import java.util.Arrays;

public class Q65_MoveAllNegElemsLeftAndPosElemsRight {

    public static void rearrange(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            if (arr[left] < 0) {
                left++;
            } else if (arr[right] > 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, -4, 5, -6};
        System.out.println("Original array:" + Arrays.toString(arr));

        rearrange(arr);

        System.out.println("Rearranged array:" + Arrays.toString(arr));
    }

}
