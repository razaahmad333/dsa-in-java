package LeetCodeProblems;

import java.util.Hashtable;

public class ValidSuduko {

    public static void main(String[] args) {

    }

    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!isGridValid(board, i * 3, j * 3)) {
                    return false;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (!isLineValid(board, i, 0, 1, 0)) {
                return false;
            }

            if (!isLineValid(board, 0, i, 0, 1)) {
                return false;
            }
        }

        return true;

    }

    private static boolean isLineValid(char[][] board, int si, int sj, int incx, int incy) {
        Hashtable<Character, Integer> digits = new Hashtable<>(9);

        for (int k = 0; k < 9; k++) {
            char val = board[si + k * incy][sj + k * incx];
            if (val != '.') {
                if (digits.containsKey(val)) {
                    return false;
                } else {
                    digits.put(val, 1);
                }
            }

        }
        return true;

    }

    private static boolean isGridValid(char[][] board, int si, int sj) {
        Hashtable<Character, Integer> digits = new Hashtable<>(9);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char val = board[si + i][sj + j];
                if (val != '.') {
                    if (digits.containsKey(val)) {
                        return false;
                    } else {
                        digits.put(val, 1);
                    }
                }
            }
        }
        return true;
    }
}
