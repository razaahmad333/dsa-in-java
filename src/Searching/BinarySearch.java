package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 6 };
        int[] arr = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
        System.out.println(binarySearch(arr, 14));
        System.out.println(orderAgnosticBinarySearch(arr, 14));
        // System.out.println(recursionBinarySearch(arr, 14, 0, arr.length - 1));
    }

    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

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

    static int recursionBinarySearch(int[] arr, int target, int left, int right) {

        int middle = left + (right - left) / 2;

        if (arr[middle] > target) {
            return recursionBinarySearch(arr, target, left, middle - 1);
        }

        if (arr[middle] < target) {
            return recursionBinarySearch(arr, target, middle + 1, right);
        }
        if (arr[middle] == target) {
            return middle;
        }

        return -1;

    }

    // when we dont know the order in which array is sorted asc or desc
    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int middle = left + (right - left) / 2;

        boolean isAsc = arr[left] < arr[right];

        while (left <= right) {
            int n = arr[middle];
            if (n == target) {
                return middle;
            } else {
                if (isAsc) {
                    if (target < n) {
                        right = middle - 1;
                    } else {
                        left = middle + 1;
                    }
                } else {
                    if (target < n) {
                        left = middle + 1;
                    } else {
                        right = middle - 1;
                    }
                }
            }

            middle = left + (right - left) / 2;
        }
        return -1;
    }
}
