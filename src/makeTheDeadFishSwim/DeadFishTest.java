package makeTheDeadFishSwim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeadFishTest {
    @Test
    public void shouldParseDeadFish(){
       assertArrayEquals(new int[]{},DeadFish.parse(""));
       assertArrayEquals(new int[]{0},DeadFish.parse("o"));
       assertArrayEquals(new int[]{},DeadFish.parse("i"));
       assertArrayEquals(new int[]{1},DeadFish.parse("io"));
       assertArrayEquals(new int[]{-1},DeadFish.parse("do"));
       assertArrayEquals(new int[]{4},DeadFish.parse("iiso"));
       assertArrayEquals(new int[] {8, 64}, DeadFish.parse("iiisdoso"));
       assertArrayEquals(new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso"));
    }

}