package Searching.Problems;

public class Position_of_number_final_intial {

    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 8;
        // output should be {1,4}
        int[] pos = findInitialAndFinalPosition(arr, target);
        System.out.println(pos[0]);
        System.out.println(pos[1]);

    }

    static int[] findInitialAndFinalPosition(int[] arr, int target) {
        int[] pos = { -1, -1 };
        pos[0] = binarySearch(arr, target, true);
        pos[1] = binarySearch(arr, target, false);

        return pos;
    }

    static int binarySearch(int[] arr, int target, boolean isInitial) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;
        int middle = left + (right - left) / 2;
        while (left <= right) {
            if (arr[middle] == target) {
                ans = middle;
                if (isInitial) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else if (arr[middle] > target) {
                right = middle - 1;
            } else if (arr[middle] < target) {
                left = middle + 1;
            }
            middle = left + (right - left) / 2;
        }
        return ans;
    }

}
