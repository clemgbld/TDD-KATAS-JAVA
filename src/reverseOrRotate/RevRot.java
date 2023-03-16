package reverseOrRotate;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RevRot {
    public static String revRot(String str, int sz) {
        if (sz > str.length() || sz == 0) return "";
        return Arrays.stream(str.split("(?<=\\G.{" + sz + "})"))
                .filter(s -> s.length() == sz)
                .map(RevRot::reverseOrRotateChunk)
                .collect(Collectors.joining());
    }

    private static String reverseOrRotateChunk(String chunk) {
        return shouldReverse(chunk) ? reverse(chunk) : rotate(chunk);
    }

    private static boolean shouldReverse(String chunk) {
        return sumAllCube(chunk) % 2 == 0;
    }

    private static int sumAllCube(String chunk) {
        return Arrays.stream(chunk.split(""))
                .mapToInt(s -> (int) Math.pow(Integer.parseInt(s), 3))
                .sum();
    }


    private static String reverse(String chunk) {
        StringBuilder sb = new StringBuilder(chunk);
        sb.reverse();
        return sb.toString();
    }

    private static String rotate(String chunk) {
        return chunk.substring(1) + chunk.charAt(0);
    }
}
