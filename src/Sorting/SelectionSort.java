package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 10, 1, 4, 5, 6, 2, 2 };
        selectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    // best case = O(N^2)
    // worst case = O(N^2)

    static void selectionSorting(int[] arr) {
        int last = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int maxIdx = getMax(arr, last);
            int temp = arr[last];
            arr[last] = arr[maxIdx];
            arr[maxIdx] = temp;
            last--;
            System.out.println(Arrays.toString(arr));
        }

    }

    static int getMax(int[] arr, int last) {
        int max = arr[0];
        int idx = 0;
        for (int i = 1; i <= last; i++) {
            if (max < arr[i]) {
                max = arr[i];
                idx = i;
            }
        }

        return idx;
    }
}
