package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 32, 4 };
        insertionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSorting(int[] arr) {
        int cnt = 0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                cnt++;
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }

                System.out.println(Arrays.toString(arr));

            }
        }
        System.out.println(cnt);

    }
}
