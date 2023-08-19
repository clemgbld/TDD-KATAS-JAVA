package subsets;

import java.util.Arrays;
import java.util.HashSet;


public class Subsets {
    public static <T> long count(T[] elems) {
        int size = new HashSet<T>(Arrays.asList(elems)).size();
        return size < 1 ? 0L : countRecur(1, size, 1);
    }

    private static long countRecur(long i, long size, long add){
        if(i >= size) return add;
        return countRecur(i + 1L,size,add + add + 1L);
    }
}
