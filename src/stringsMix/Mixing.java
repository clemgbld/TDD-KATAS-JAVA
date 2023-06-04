package stringsMix;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mixing {

    public static final String DELIMITER = "/";
    public static final String EQUAL_PREFIX = "=:";
    private static final String S1_PREFIX = "1:";
    private static final String S2_PREFIX = "2:";

    public static String mix(String s1, String s2) {

        Map<String,Long> map1 = buildMapGroupedByCounting(s1);
        Map<String,Long> map2 = buildMapGroupedByCounting(s2);

        List<String> strList1 = map1.entrySet().stream()
                .filter(Mixing::isMoreThanOne)
                .filter((e)-> e.getValue() >= map2.getOrDefault(e.getKey(),0L))
                .map((e)->{
                    String prefix = isCountEqual(map1,map2,e.getKey()) ? EQUAL_PREFIX : S1_PREFIX;
                     return prefix + e.getKey().repeat(map1.get(e.getKey()).intValue());
                }).toList();

        List<String> strList2 = map2.entrySet().stream()
                .filter(Mixing::isMoreThanOne)
                .filter((e)-> e.getValue() > map1.getOrDefault(e.getKey(),0L))
                .map((e)-> S2_PREFIX + e.getKey().repeat(map2.get(e.getKey()).intValue()))
                .toList();


        return Stream.concat(strList1.stream(),strList2.stream())
                .sorted(Comparator.comparing(String::length)
                        .reversed()
                        .thenComparing(s -> s.length() == 0 ? -1 : s.charAt(0))
                        .thenComparing(Function.identity()))
                .collect(Collectors.joining(DELIMITER));

    }

    private static boolean isCountEqual(Map<String, Long> map1, Map<String, Long> map2, String key) {
        return map1.getOrDefault(key, 0L).equals(map2.getOrDefault(key, 0L));
    }

    private static Map<String, Long> buildMapGroupedByCounting(String s1) {
        return Arrays.stream(s1.replaceAll("[^a-z]", "")
                        .split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

   private static boolean isMoreThanOne(Map.Entry<String, Long> e){
        return e.getValue() > 1L;
    }

}
