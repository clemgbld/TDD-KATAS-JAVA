package camelCaseMethod;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static String camelCase(String s) {
      return  Arrays.stream(s.trim().split(" "))
              .map(Solution::capitalize)
              .collect(Collectors.joining(""));
    }

    private static String capitalize(String s) {
        return  s.length() == 0 ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}
