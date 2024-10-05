import java.util.Arrays;

public class Q69_Leetcode_1929_ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] arr = new int[n*2];

        int i =0;
        for(; i<n; i++)
        {
            arr[i] = nums[i];
        }

        for(int j =0; j<n; j++ )
        {
            arr[i++] = nums[j];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
}
