package mostFrequentlyUsedWordsInAText;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class TopWords {
    public static final int LIMIT = 3;

    public static List<String> top3(String text) {
        return Arrays.stream(text.toLowerCase().split("[^a-z*|']"))
                .filter(o -> !o.isEmpty() && !o.replace("'","").isEmpty())
                .collect(groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .limit(LIMIT)
                .collect(Collectors.toList());
    }


}
