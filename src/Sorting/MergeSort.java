package Sorting;

import java.util.Arrays;

public class MergeSort {
    
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2 };
        mergeSortInPlace(arr, 0, arr.length / 2 - 1, arr.length / 2, arr.length - 1);
        // System.out.println(Arrays.toString(mergeSort(arr)));
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int arr[]) {

        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] firstHalf = new int[mid];
        for (int i = 0; i < mid; i++) {
            firstHalf[i] = arr[i];
        }
        mid = arr.length % 2 == 0 ? mid : mid + 1;
        int[] secondHalf = new int[mid];
        for (int i = 0; i < mid; i++) {
            secondHalf[i] = arr[firstHalf.length + i];
        }

        int[] firstHalfSorted = mergeSort(firstHalf);
        int[] secondHalfSorted = mergeSort(secondHalf);

        int m = 0, n = 0;
        for (int i = 0; i < arr.length; i++) {

            if (m == firstHalfSorted.length && n != secondHalfSorted.length) {
                arr[i] = secondHalfSorted[n];
                n++;
            } else if (m != firstHalfSorted.length && n == secondHalfSorted.length) {
                arr[i] = firstHalfSorted[m];
                m++;
            } else if (firstHalfSorted[m] < secondHalfSorted[n]) {
                arr[i] = firstHalfSorted[m];
                m++;
            } else if (firstHalfSorted[m] > secondHalfSorted[n]) {
                arr[i] = secondHalfSorted[n];
                n++;
            } else {
                arr[i] = firstHalfSorted[m];
                arr[i + 1] = secondHalfSorted[n];
                m++;
                n++;
                i++;
            }
        }
        return arr;
    }

    static void mergeSortInPlace(int arr[], int s1, int e1, int s2, int e2) {

        int l1 = e1 - s1 + 1;
        int l2 = e2 - s2 + 1;
        if (l1 <= 1 && l2 <= 0) {
            return;
        }
        int mid = (l1) / 2;
        if (l1 > 1) {
            mergeSortInPlace(arr, s1, mid - 1, mid, e1);
        }
        mid = l2 / 2;
        if (l2 > 1) {
            mergeSortInPlace(arr, s2, s2 + mid - 1, s2 + mid, e2);
        }
        int m = 0, n = 0;
        for (int i = 0; i < l1 + l2; i++) {
            if (m == l1 && n != l2) {
                swap(arr, s1 + i, s2 + n);
                n++;
            } else if (m != l1 && n == l2) {
                swap(arr, s1 + i, s1 + m);
                m++;
            } else if (arr[s1 + m] < arr[s2 + n]) {
                swap(arr, s1 + i, s1 + m);
                m++;
            } else if (arr[s1 + m] > arr[s2 + n]) {
                swap(arr, s1 + i, s2 + n);
                n++;
            } else {
                swap(arr, s1 + i, s1 + m);
                swap(arr, s1 + i, s2 + n);
                m++;
                n++;
                i++;
            }
        }
    }

    static void swap(int[] arr, int from, int to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

}
