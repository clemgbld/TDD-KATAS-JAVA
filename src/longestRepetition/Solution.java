package longestRepetition;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.LinkedHashMap;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Solution {
    public static Object[] longestRepetition(String s) {
        if(s.equals("")) return new Object[]{"",0};

        Map<String, Integer> map = Arrays.stream(s.toLowerCase().split("(?<=(.))(?!\\1)"))
                .collect(Collectors.toMap(Function.identity(), String::length, (a, b) -> a, LinkedHashMap::new));

        Map.Entry<String,Integer> result = map.entrySet().stream().max(Map.Entry.comparingByValue())
                .get();

        return  new Object[]{String.valueOf(result.getKey().charAt(0)),result.getValue()};

    }

}

