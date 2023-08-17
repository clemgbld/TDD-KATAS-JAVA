package evenFibonacciSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    void shouldMakeTheSumOfTheEvenNumbersInTheFibonacciSuiteForAGivenNumber(){
        assertEquals(0L,Kata.fibonacci(0L));
        assertEquals(2L,Kata.fibonacci(3L));
        assertEquals(10L,Kata.fibonacci(10L));
        assertEquals(44, Kata.fibonacci(100));
        assertEquals(2, Kata.fibonacci(8));
    }

}