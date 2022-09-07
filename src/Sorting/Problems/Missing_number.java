package Sorting.Problems;

import java.util.Arrays;

public class Missing_number {
    public static void main(String[] args) {
        int[] arr = { 0, 2 };
        System.out.println(findNumber(arr));
    }

    static int findNumber(int[] arr) {

        if (arr.length == 1) {
            return 1 - arr[0];
        }
        int num = -1;
        int pointer = 0;
        while (pointer < arr.length) {
            int temp = arr[pointer];

            if (pointer == arr[pointer]) {
                pointer++;
            } else {
                if (temp == arr.length) {
                    pointer++;
                    continue;
                } else {
                    arr[pointer] = arr[temp];
                    arr[temp] = temp;
                }
                if (pointer != arr[pointer]) {
                    num = pointer;
                } else {
                    num = -1;
                }
            }

        }

        System.out.println(Arrays.toString(arr));
        if (num == -1) {
            return arr.length;
        }
        return num;
    }
}
