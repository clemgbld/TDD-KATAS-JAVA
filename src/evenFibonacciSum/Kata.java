package evenFibonacciSum;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Kata {
    public static long fibonacci(long max) {
        return buildFibonacciSuite(max).stream()
                .filter((num)-> num % 2 == 0)
                .reduce(0L, Long::sum);
    }

    private static List<Long> buildFibonacciSuite(long max) {
        return Stream.iterate(new long[]{0, 1}, fib -> new long[]{fib[1], fib[0] + fib[1]})
                .mapToLong(fib -> fib[0])
                .takeWhile(fib -> fib < max)
                .boxed()
                .collect(Collectors.toList());
    }
}
