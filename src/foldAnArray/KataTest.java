package foldAnArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    void shouldFoldAnArray(){
        assertArrayEquals(new int[]{1},Kata.foldArray(new int[]{1},1));
        assertArrayEquals(new int[]{2},Kata.foldArray(new int[]{2},1));
        assertArrayEquals(new int[]{15},Kata.foldArray(new int[]{9,6},1));
        assertArrayEquals(new int[]{14},Kata.foldArray(new int[]{8,6},1));
        assertArrayEquals(new int[]{7,7},Kata.foldArray(new int[]{4,4,3,3},1));
        assertArrayEquals(new int[]{2,2,2},Kata.foldArray(new int[]{1,1,1,1,1,1},1));
        assertArrayEquals(new int[]{6,6,3}, Kata.foldArray(new int[]{1,2,3,4,5},1));
        assertArrayEquals(new int[]{9,6},Kata.foldArray(new int[]{1,2,3,4,5},2));
    }

}