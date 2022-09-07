package LeetCodeProblems;

import java.util.Hashtable;

public class RomanToInteger {

    public static void main(String[] args) {
        String str = "MCMXCIV";
        Hashtable<Character, Integer> romanToInteger = new Hashtable<>();
        int total = 0;
        int prev = 0;
        int value = 0;
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        for (int i = 0; i < str.length(); i++) {
            char r = str.charAt(i);
            value = romanToInteger.get(r);

            if (prev < value && prev != 0) {
                total = total - prev + (value - prev);

            } else {
                total = total + value;
            }

            prev = value;
        }

        System.out.println(total);

    }
}
