package rangeExtraction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void shouldExtractAllRange(){
        assertEquals("",Solution.rangeExtraction(new int[]{}));
        assertEquals("1",Solution.rangeExtraction(new int[]{1}));
        assertEquals("2",Solution.rangeExtraction(new int[]{2}));
        assertEquals("1,2",Solution.rangeExtraction(new int[]{1,2}));
        assertEquals("1-3",Solution.rangeExtraction(new int[]{1,2,3}));
        assertEquals("1,2,5",Solution.rangeExtraction(new int[]{1,2,5}));
        assertEquals("1-3,5",Solution.rangeExtraction(new int[]{1,2,3,5}));
        assertEquals("-6,-3",Solution.rangeExtraction(new int[]{-6,-3}));
        assertEquals("-10--8,-6,-3-1,3-5,7-11,14,15,17-20",Solution.rangeExtraction(new int[]{-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20}));
        assertEquals("-3--1,2,10,15,16,18-20",Solution.rangeExtraction(new int[]{-3,-2,-1,2,10,15,16,18,19,20}));

    }

}