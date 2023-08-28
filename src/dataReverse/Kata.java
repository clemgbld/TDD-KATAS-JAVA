package dataReverse;


import java.util.stream.IntStream;

public class Kata {
    public static int[] DataReverse(int[] data) {
        return IntStream.range(0, data.length)
                .map(i -> data[data.length - 8 - (i / 8 * 8) + (i % 8)])
                .toArray();
    }

}
