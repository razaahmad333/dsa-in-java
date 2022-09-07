package Searching.Problems;

public class Search_in_infinite_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 17, 28, 30, 32, 32, 63 }; // infinite array length means u cant use arr.length
        int target = 6;
        System.out.println(searchByWindowSliding(arr, target));
    }

    static int searchByWindowSliding(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start) * 2;
            start = newStart;

        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int left = start;
        int right = end;

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
