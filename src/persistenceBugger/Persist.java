package persistenceBugger;

import java.util.Arrays;

public class Persist {
    public static int persistence(long num) {
      return persistenceRecur(num,0);
    }

    private static int persistenceRecur(long num, int result){
        if(Long.toString(num).length() == 1) return  result;
        long digitMultiplied = Arrays.stream(Long.toString(num).split(""))
                .mapToLong(Long::parseLong)
                .reduce(1L, (acc,curr)-> acc * curr);
        return persistenceRecur(digitMultiplied,result + 1);
    }
}
