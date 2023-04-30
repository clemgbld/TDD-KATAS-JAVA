package writeNumberInExpandedForm;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Kata {
    public static String expandedForm(int num) {
        return IntStream.range(0,String.valueOf(num).length())
                .filter(buildFilterIntPredicate(num))
                .mapToObj(buildReplaceByZeroAfterFirstDigit(num))
                .collect(Collectors.joining(" + "));
    }

    private static IntFunction<String> buildReplaceByZeroAfterFirstDigit(int num) {
        return i -> getFirstDigitChar(num, i) + "0".repeat(String.valueOf(num).length() - 1 - i);
    }

    private static IntPredicate buildFilterIntPredicate(int num) {
        return i -> getFirstDigitChar(num, i) != '0' || String.valueOf(num).length() == 1;
    }

    private static char getFirstDigitChar(int num, int i) {
        return String.valueOf(num).substring(i).charAt(0);
    }
}
