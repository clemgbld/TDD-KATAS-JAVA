package enoughIsEnough;

import java.util.*;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> map = new HashMap<>();
        return Arrays.stream(elements)
                .filter(num -> {
                    int count = map.getOrDefault(num, 0);
                    map.put(num, count + 1);
                    return count < maxOccurrences;
                })
                .toArray();
    }
}
