package Searching.Problems;

public class Find_in_moutain_array {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 5, 4, 3, 2, 1 };
        int target = 3;
        System.out.println(findInMountainArr(arr, target));
    }

    static int findInMountainArr(int[] arr, int target) {
        int peakIdx = peak(arr);

        int ans = orderAgnosticBinarySearch(arr, target, 0, peakIdx, true);
        if (ans == -1) {
            return orderAgnosticBinarySearch(arr, target, peakIdx, arr.length - 1, false);
        }
        return ans;

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
                return middle;
            }
            middle = left + (right - left) / 2;

        }
        return middle;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end, boolean isAsc) {
        int middle = start + (end - start) / 2;
        while (start <= end) {
            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] > target) {
                if (isAsc) {
                    end = middle - 1;
                } else {
                    start = middle + 1;
                }
            } else if (arr[middle] < target) {
                if (isAsc) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
            middle = start + (end - start) / 2;
        }

        return -1;
    }
}
