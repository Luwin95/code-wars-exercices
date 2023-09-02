package fr.perso.bau.narcissistic;

import java.util.Arrays;

public class NumberUtils {
    public static boolean isNarcissistic(int number) {
        char[] numberChars = String.valueOf(number).toCharArray();
        double sum = 0;
        for(char currentDigit : numberChars){
            sum += Math.pow(Integer.parseInt(String.valueOf(currentDigit)), numberChars.length);
        }
        return sum == number;
    }

    private static boolean isNarcissisticSolution(int number) {
        int length = String.valueOf(number).length();
        return number == Arrays.stream(String.valueOf(number).split(""))
                .mapToInt(Integer::parseInt)
                .mapToDouble(m -> Math.pow(m, length))
                .sum();
    }
}
