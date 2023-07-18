package rotateArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotatorTest {
    @Test
    void shouldRotateTheArrayNTimes(){
        var rotator = new Rotator();
        assertArrayEquals(new Object[]{1,2,3,4,5},rotator.rotate(new Object[]{1,2,3,4,5},0));
        assertArrayEquals(new Object[]{1,2,3,4},rotator.rotate(new Object[]{1,2,3,4},0));
        assertArrayEquals(new Object[]{5,1,2,3,4},rotator.rotate(new Object[]{1,2,3,4,5},1));
        assertArrayEquals(new Object[]{2,3,4,5,1},rotator.rotate(new Object[]{1,2,3,4,5},-1));
        assertArrayEquals(new Object[]{2, 3, 4, 5, 1},rotator.rotate(new Object[]{1,2,3,4,5},4));
        assertArrayEquals(new Object[]{5, 1, 2, 3, 4},rotator.rotate(new Object[]{1,2,3,4,5},-4));
        assertArrayEquals(new Object[]{3, 4, 5, 1, 2}, rotator.rotate(new Object[]{1,2,3,4,5},12478));
    }

}