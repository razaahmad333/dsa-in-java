package Sorting.Problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class All_missing_number {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        cyclicSorting(arr);
        // System.out.println(Arrays.toString(arr));
    }

    static void cyclicSorting(int[] arr) {
        int pointer = 0;
        int cnt = 0;
        int prvs = arr[pointer];
        while (cnt < arr.length * 2) {
            cnt++;
            if (pointer == arr[pointer] - 1) {
                pointer++;
            } else {
                int temp = arr[pointer];
                if (temp == prvs) {
                    pointer++;
                    continue;
                }
                prvs = temp;
                arr[pointer] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
        List<Integer> newArr = new LinkedList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                newArr.add(i + 1);
            }
        }

    }
}
