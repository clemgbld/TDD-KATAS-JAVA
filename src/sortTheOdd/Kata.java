package sortTheOdd;

import java.util.*;


public class Kata {
    public static int[] sortArray(int[] ints) {
        List<Integer> odds = new ArrayList<>(Arrays.stream(ints)
                .filter(Kata::isOdd)
                .sorted()
                .boxed()
                .toList());

        ArrayList<Integer> result = new ArrayList<>();

        for (int anInt:ints){
            if(isOdd(anInt)){
                result.add(odds.remove(0));
            }else {
                result.add(anInt);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }


    private static boolean isOdd (int n){
        return n % 2 != 0;
    }
}
