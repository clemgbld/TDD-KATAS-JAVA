package findTheParityOutlier;

import java.util.Arrays;
import java.util.function.Predicate;

public class FindOutlier {
    public static int find(int[] ints) {
       int[] odds = filterIntsWithPredicate(ints,FindOutlier::isOdd);
       if(odds.length == 1){
           return odds[0];
       }
        return filterIntsWithPredicate(ints,FindOutlier::isEven)[0];
    }

    private static boolean isEven (int num){
        return num % 2 == 0;
    }

    private static boolean isOdd (int num){
        return !isEven(num);
    }

    private static int[] filterIntsWithPredicate(int[] ints, Predicate<Integer> predicate){
        return Arrays.stream(ints)
                .filter(predicate::test)
                .toArray();
    }


}
