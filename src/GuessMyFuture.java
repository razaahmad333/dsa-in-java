import java.util.Random;

public class GuessMyFuture {
    public static void main(String[] args) throws Exception {
        final int[] numbers = { 1, 2, 3, 4, 5, 6 };
        Random generator = new Random();
        int randomInd = generator.nextInt(numbers.length);
        System.out.println(getMyFuture(numbers[randomInd]));

        for (int i : numbers) {
            System.out.println(getMyFuture(i));
        }

    }

    public static String getMyFuture(int cardNumber) {
        switch (cardNumber) {
            case 1:
                return "Engineer";
            case 2:
                return "Frustrated Engineer";
            case 3:
                return "Happy Engineer";
            default:
                return "Go in field and work hard";
        }
    }
}
