package romanNumerals;

import java.util.Map;
import java.util.stream.IntStream;

public class RomanNumerals {

    private static final Map<Character, Integer> ROMAN_TO_ARABIC = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);

    public static int romanToArabic(String roman) {
        return IntStream.range(0, roman.length())
                .map(i -> isSpecialRomanNumber(roman, i) ? -ROMAN_TO_ARABIC.get(roman.charAt(i)) : ROMAN_TO_ARABIC.get(roman.charAt(i)))
                .sum();
    }



    private static boolean isSpecialRomanNumber(String roman, int i) {
        return roman.length() > i + 1 && ROMAN_TO_ARABIC.get(roman.charAt(i)) < ROMAN_TO_ARABIC.get(roman.charAt(i + 1));
    }
}
