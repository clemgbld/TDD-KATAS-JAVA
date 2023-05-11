package consecutiveStrings;
import java.util.Arrays;
import java.util.stream.IntStream;


public class LongestConsec {
    public static String longestConsec(String[] strings, int k) {

        if(k < 1) return "";

        return IntStream.range(0, strings.length - k + 1)
                .mapToObj(i -> String.join("", Arrays.copyOfRange(strings, i, i + k)))
               .reduce("", (acc, curr) -> acc.length() >= curr.length() ? acc : curr);

    }

}
