package doesMyNumberLooksBigInThis;

import java.util.Arrays;

public class NumberUtils {
    public static boolean isNarcissistic(int num) {
        return Arrays.stream(Integer.toString(num).split(""))
                .mapToInt(Integer::parseInt)
                .mapToDouble(n-> Math.pow(n,Integer.toString(num).length()))
                .sum() == num;
    }
}
