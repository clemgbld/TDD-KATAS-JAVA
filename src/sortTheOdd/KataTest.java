package sortTheOdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    void shouldSortTheOdd(){
        assertArrayEquals(new int[]{},Kata.sortArray(new int[]{}));
        assertArrayEquals(new int[]{1},Kata.sortArray(new int[]{1}));
        assertArrayEquals(new int[]{1,5},Kata.sortArray(new int[]{5,1}));
        assertArrayEquals(new int[]{1,8,5},Kata.sortArray(new int[]{5,8,1}));
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 },Kata.sortArray(new int[]{5, 3, 2, 8, 1, 4}));
        assertArrayEquals(new int[]{6,3,5,4,2} , Kata.sortArray(new int[]{6,3,5,4,2}));
    }

}