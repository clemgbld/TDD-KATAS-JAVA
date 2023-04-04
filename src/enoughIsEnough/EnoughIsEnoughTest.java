package enoughIsEnough;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnoughIsEnoughTest {
    @Test
    public void shouldDeleteOccurrencesOfAnElementIfItOccursMoreThanNTimes(){
        assertArrayEquals(new int[]{},EnoughIsEnough.deleteNth(new int[]{},1));
        assertArrayEquals(new int[]{1},EnoughIsEnough.deleteNth(new int[]{1},1));
        assertArrayEquals(new int[]{1},EnoughIsEnough.deleteNth(new int[]{1,1},1));
        assertArrayEquals(new int[]{1,1},EnoughIsEnough.deleteNth(new int[]{1,1},2));
        assertArrayEquals(new int[]{2},EnoughIsEnough.deleteNth(new int[]{2,2},1));
        assertArrayEquals(
                new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
                EnoughIsEnough.deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
        );
    }
}