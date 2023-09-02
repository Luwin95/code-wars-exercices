package fr.perso.bau.sortDescPositiveNumberDigits;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        return Integer.parseInt(Arrays.stream(String.valueOf(num).split(""))
                .mapToInt(Integer::parseInt).map(i -> -i).sorted().map(i -> -i).mapToObj(String::valueOf).collect(Collectors.joining()));
    }

    private static int sortDescSolution(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }
}
