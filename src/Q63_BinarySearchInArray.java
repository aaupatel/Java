public class Q63_BinarySearchInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};     // Sorted Order
        int target = 7;
        int index = -1;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
            }
            if (target <= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (index != -1) {
            System.out.println(target + " Element found at index = " + index);
        } else {
            System.out.println("Element Not Found");
        }
    }
}
