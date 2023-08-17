package evenFibonacciSum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "3, 2",
            "10, 10",
            "100, 44",
            "8, 2"
    })
    void shouldMakeTheSumOfTheEvenNumbersInTheFibonacciSuiteForAGivenNumber(long input, long expected) {
        assertEquals(expected, Kata.fibonacci(input));
    }
}