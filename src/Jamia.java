public class Jamia {
    private final static int rooms = 299;

    public static void main(String[] args) {
        System.out.println("its jamia and total rooms are " + rooms);
        System.out.println(getDeanName());

        System.out.println(getSumOfDigits(10));

    }

    private static String getDeanName() {
        return "Prof Ibraheem";
    }

    private static int getSumOfDigits(int dig) {
        if (dig > 0) {
            return dig + getSumOfDigits(dig - 1);
        } else {
            return 0;
        }
    }
}
