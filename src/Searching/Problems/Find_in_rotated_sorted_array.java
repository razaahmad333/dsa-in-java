package Searching.Problems;

public class Find_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 10, 12, 1, 3 };
        int target = 1;

        // step 1: find pivot ( max value )
        int pivot = findPivot(arr);
        int ans = findPos(target, pivot, arr);
        System.out.println(ans);
    }

    static int findPos(int target, int pivot, int[] arr) {
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot);
        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int middle = start + (end - start) / 2;
        while (start <= end) {
            if (arr[middle] > arr[middle + 1]) {
                return middle;
            } else if (arr[middle - 1] > arr[middle]) {
                return middle - 1;
            } else if (arr[start] > arr[middle]) {
                end = middle - 1;
            } else if (arr[start] < arr[middle]) {
                start = middle + 1;
            }
            middle = start + (end - start) / 2;
        }

        return start;
    }

    static int binarySearch(int[] arr, int target, int left, int right) {

        int middle = left + (right - left) / 2;

        while (left <= right) {
            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] > target) {
                right = middle - 1;
            } else if (arr[middle] < target) {
                left = middle + 1;
            }
            middle = left + (right - left) / 2;

        }
        return -1;
    }
}
