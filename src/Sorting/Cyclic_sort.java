package Sorting;

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 6, 3, 5 };
        cyclicSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSorting(int[] arr) {
        int pointer = 0;
        while (pointer < arr.length) {
            if (pointer == arr[pointer] - 1) {
                pointer++;
            } else {
                int temp = arr[pointer];
                arr[pointer] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }
    }
}
