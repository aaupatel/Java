import java.util.Arrays;

public class Q70_Leetcode_1920_BuildArrayFromPermutation {

    public static int[] buildArray(int[] arr) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        return ans;

        // Time O(n) = Done
        // Space O(1) = Done
//        final int n = arr.length;
//
//        for (int i = 0; i < n; ++i)
//            arr[i] += n * (arr[arr[i]] % n);
//
//        for (int i = 0; i < n; ++i)
//            arr[i] /= n;
//
//        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(arr)));
    }
}

