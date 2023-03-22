package findTheUniqueNumber;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Kata {
    public static double findUniq(double[] doubles) {
        return Objects.requireNonNull(Arrays.stream(doubles)
                        .boxed()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() < 2)
                        .findFirst()
                        .orElse(null))
                .getKey();
    }
}
