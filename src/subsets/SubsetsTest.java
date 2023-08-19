package subsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsetsTest {
    @Test
    void shouldFindTheNumberOfSubsets(){
        assertEquals(0L,Subsets.count(new Integer[]{}));
        assertEquals(1L,Subsets.count(new Integer[]{1}));
        assertEquals(3L,Subsets.count(new Integer[]{1,2}));
        assertEquals(7L,Subsets.count(new Integer[]{1,2,3}));
        assertEquals(15L, Subsets.count(new Integer[]{ 1, 2, 3, 4 }));
        assertEquals( 31L, Subsets.count(new Integer[]{ 1, 2, 3, 4,5 }));
        assertEquals( 63L, Subsets.count(new Integer[]{ 1, 2, 3, 4,5,6 }));
        assertEquals(1125899906842623L,Subsets.count(new Integer[]{39, 70, 88, 16, 100, 79, 96, 75, 74, 6, 18, 68, 34, 35, 85, 54, 64, 82, 4, 48, 10, 89, 19, 95, 28, 67, 32, 83, 38, 25, 55, 76, 92, 87, 22, 30, 43, 3, 58, 42, 61, 94, 13, 99, 8, 86, 72, 46, 51, 41}));
    }

    @Test
    void shouldRemoveDuplicate(){
        assertEquals(1L,Subsets.count(new Integer[]{1,1,1}));
    }

}