package duplicateEncoder;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateEncoder {
    public static String encode(String word) {

        String lowerCasedWord = word.toLowerCase();

        Map<Character,Long> map =  lowerCasedWord.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return lowerCasedWord. length() > 0 ? Arrays.stream(lowerCasedWord.split(""))
                .map(s -> map.getOrDefault(s.charAt(0),0L) > 1L ? ")" : "(")
                .collect(Collectors.joining()) : "";
    }
}
