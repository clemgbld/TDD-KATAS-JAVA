package createPhoneNumber;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static String createPhoneNumber(int[] ints) {
       return Arrays.stream(ints)
               .mapToObj(Integer::toString)
               .collect(Collectors.joining())
               .replaceFirst("^(\\d{3})(\\d{3})(\\d{4})$","($1) $2-$3");
    }
}
