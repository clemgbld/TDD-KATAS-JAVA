package weightForWeight;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WeightSort {
    public static String orderWeight(String numsString) {
      return Arrays.stream(numsString.trim().split("\\s+"))
              .sorted((s1,s2)->shouldSwitch(s1,s2) ? 1 : -1 )
              .collect(Collectors.joining(" "));
    }

    private static boolean shouldSwitch (String strNum1, String strNum2){
        int sum1 = sumAllDigits(strNum1);
        int sum2 = sumAllDigits(strNum2);
        if(sum1 == sum2) return strNum1.compareTo(strNum2) > 0;
        return sum1 > sum2;
    }

    private static int sumAllDigits(String strNum){
      return Arrays.stream(strNum.split("")).mapToInt(Integer::valueOf).sum();
    }
}
