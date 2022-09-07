package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {
                4
        };

        bubbleSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    // aka sinking sort , aka exchanging sort
    // in place sorting algorithm because no new array is created here
    // best case O(N) array is sorted
    // worst case O(N^2) array is sorted (order = -1)
    static void bubbleSorting(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                } else {
                    isSorted = true;
                }
            }

            if (isSorted) {
                break;
            }

        }

    }
}
