package LeetCodeProblems.Recursion;

public class Elimination_game {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // 2, 4,
        int n = 6;
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }
        System.out.println(elimination(arr, arr.length, true));

    }

    static int elimination(int arr[], int size, boolean left_to_right) {
        if (size <= 1) {
            return size == 0 ? -1 : arr[0];
        }

        int cnt = 0;

        if (left_to_right) {
            for (int i = 0; i < size; i++) {
                if (i % 2 != 0) {
                    arr[cnt] = arr[i];
                    cnt++;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if ((size - i - 1) % 2 != 0) {
                    arr[size % 2 == 0 ? size / 2 : (size - 1) / 2 - cnt - 1] = arr[i];
                    cnt++;
                }
            }
        }

        return elimination(arr, cnt, !left_to_right);
    }
}
