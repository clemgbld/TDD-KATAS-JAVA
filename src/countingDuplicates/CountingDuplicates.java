package countingDuplicates;

import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String s) {
        return s.chars()
                .map(Character::toLowerCase)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(e -> e.getValue() > 1)
                .toList()
                .size();
    }
}
