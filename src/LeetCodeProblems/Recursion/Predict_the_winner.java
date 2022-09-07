package LeetCodeProblems.Recursion;

public class Predict_the_winner {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 233, 7 };
        // int[] arr = { 99, 2,1 };

        boolean won = predictTheWinner(0, arr.length - 1, arr, 0, 0, true);
        if (won) {
            System.out.println("player 1 won");
        } else {
            System.out.println("player 1 lost");
        }
    }

    static boolean predictTheWinner(int start, int end, int[] arr, int player1, int player2, boolean play1) {

        if (start == end) {
            return (play1 ? player1 + arr[start] : player1) >= (play1 ? player2 : player2 + arr[start]);
        }
        // return pla
        if (play1) {

            if (player2 + arr[start + 1] <= player2 + arr[end - 1]) {
                if (player1 + arr[start] >= player1 + arr[end]) {
                    return predictTheWinner(start + 1, end, arr, player1 + arr[start], player2, !play1);
                } else {
                    return predictTheWinner(start, end - 1, arr, player1 + arr[end], player2, !play1);
                }
            } else {
                if (player1 + arr[start] >= player1 + arr[end]) {
                    return predictTheWinner(start + 1, end, arr, player1 + arr[start], player2, !play1);
                } else {
                    return predictTheWinner(start, end - 1, arr, player1 + arr[end], player2, !play1);
                }
            }
        } else {

            if (player1 + arr[start + 1] <= player1 + arr[end - 1]) {
                if (player2 + arr[start] >= player2 + arr[end]) {
                    return predictTheWinner(start + 1, end, arr, player1, player2 + arr[start], !play1);
                } else {
                    return predictTheWinner(start, end - 1, arr, player1, player2 + +arr[end], !play1);
                }
            }

            if (player1 + arr[start + 1] <= player1 + arr[end - 1]
                    && player2 + arr[start] >= player2 + arr[end]) {
                return predictTheWinner(start + 1, end, arr, player1, player2 + arr[start], !play1);
            } else {
                return predictTheWinner(start, end - 1, arr, player1, player2 + +arr[end], !play1);
            }
        }
    }
}
