package Recursion;

public class Check_array_sorted {
    public static void main(String[] args) {
        // int arr[] = { -11, 2, 3, 4, 15, 6, 7, 8, 9, 10 };
        // System.out.println(isArraySorted(arr, 0));
        // System.out.println(findElement(arr, 15, 0));

        int[] rotatedArray = { 4, 5, 1, 2, 3 };
        System.out.println(binarySearchInRotatedArray(rotatedArray, 0, rotatedArray.length - 1, 4));
    }

    static boolean isArraySorted(int[] arr, int pointer) {
        if (pointer == arr.length - 1) {
            return true;
        }
        return arr[pointer] <= arr[pointer + 1] && isArraySorted(arr, pointer + 1);
    }

    static int findElement(int[] arr, int element, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == element) {
            return index;
        }

        return findElement(arr, element, index + 1);
    }

    static int binarySearchInRotatedArray(int[] arr, int start, int end, int target) {
        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            return mid;
        }

        if (start == end) {
            return -1;
        }
        if (arr[mid] > arr[start]) {
            if (target > arr[start] && target < arr[mid]) {
                return binarySearchInRotatedArray(arr, start, mid - 1, target);
            }
        } else if (arr[mid] < arr[start]) {
            if (target > arr[mid]) {
                return binarySearchInRotatedArray(arr, start, mid - 1, target);
            }
        }

        return binarySearchInRotatedArray(arr, mid + 1, end, target);

    }
}
