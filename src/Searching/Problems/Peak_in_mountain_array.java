package Searching.Problems;

public class Peak_in_mountain_array {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 5 };
        System.out.println(peak(arr));
    }

    static int peak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        int middle = left + (right - left) / 2;

        while (left < right) {
            if (arr[middle] > arr[middle + 1]) {
                right = middle;
            } else if (arr[middle] < arr[middle + 1]) {
                left = middle + 1;
            } else {
                return arr[middle];
            }
            middle = left + (right - left) / 2;

        }
        return arr[middle];
    }
}
