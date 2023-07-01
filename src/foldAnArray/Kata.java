package foldAnArray;


import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
    public static int[] foldArray(int[] ints,int runs) {
        if(runs == 0) return ints;

        boolean isOdd = ints.length % 2 != 0;

        List<Integer> coreList = IntStream.range(0,ints.length / 2)
                .mapToObj(i -> ints[i] + ints[ints.length - (i + 1)])
                .toList();


        List<Integer>  lastElementList = IntStream.range(0, ints.length)
                .filter(i -> isOdd && i ==  Math.ceil( ints.length / 2))
                .mapToObj(i -> ints[i])
                .toList();


       int[] foldedArray = Stream.concat(coreList.stream(),lastElementList.stream())
                .mapToInt(Integer::intValue)
                .toArray();

        return foldArray(foldedArray, runs -1);

    }
}
