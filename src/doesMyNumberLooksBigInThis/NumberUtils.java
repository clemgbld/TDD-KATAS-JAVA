package doesMyNumberLooksBigInThis;

import java.util.Arrays;

public class NumberUtils {
    public static boolean isNarcissistic(int num) {
        var strNums = Integer.toString(num).split("");

        return Arrays.stream(strNums).mapToInt(Integer::parseInt)
                .mapToDouble(n-> Math.pow(n,strNums.length))
                .sum() == num;
    }
}
