package splitStrings;
import java.util.stream.IntStream;

public class StringSplit {
    public static String[] solution(String s) {
        return IntStream.range(0, s.length() / 2 + s.length() % 2)
                .mapToObj(i -> s.substring(i * 2, Math.min(i * 2 + 2, s.length())))
                .map(subStr -> subStr.length() == 2 ? subStr : subStr + "_")
                .toArray(String[]::new);
    }
}
