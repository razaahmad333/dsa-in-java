package Searching.Problems;

public class Ceiling_N_Floor {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 8, 11, 22, 34 };
        int target = 40;
        int ans = ceiling(target, arr);
        // int ans = floor(target, arr);

        if (ans == -1) {
            System.out.println("not available");
        } else {
            System.out.println(arr[ans]);
        }
    }

    // it gives the minimum number in array greater or equal to target
    // target = 0, output = 2
    static int ceiling(int target, int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        if (target > arr[right]) {
            return -1;
        }

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
        System.out.println(left);
        System.out.println(right);
        return left;
    }

    // it gives the maximum number in array less or equal to target
    // target == 80 , ans == 34
    static int floor(int target, int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        if (target < arr[left]) {
            return -1;
        }

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
        System.out.println(left);
        System.out.println(right);
        return right;
    }
}
