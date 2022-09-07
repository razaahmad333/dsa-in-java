package Searching.Problems;

public class Smallest_letter_greater_than_target {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'x';

        System.out.println(solution(letters, target));
    }

    static char solution(char[] arr, char target) {

        int left = 0;
        int right = arr.length - 1;

        if (target > arr[right]) {
            return arr[0];
        }

        int middle = left + (right - left) / 2;

        while (left <= right) {
            if (arr[middle] == target) {
                continue;
            } else if (arr[middle] > target) {
                right = middle - 1;
            } else if (arr[middle] < target) {
                left = middle + 1;
            }
            middle = left + (right - left) / 2;
        }
        return arr[left];
    }
}
