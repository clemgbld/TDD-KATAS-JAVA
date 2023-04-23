package directionsReduction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirReductionTest {

    @Test
    void shouldReduceTheDirectionsToTheMostEfficientOnes(){
        assertArrayEquals(new String[]{}, DirReduction.dirReduc(new String[]{}));
        assertArrayEquals(new String[]{"WEST"}, DirReduction.dirReduc(new String[]{"WEST"}));
        assertArrayEquals(new String[]{"NORTH","WEST"}, DirReduction.dirReduc(new String[]{"NORTH","WEST"}));
        assertArrayEquals(new String[]{}, DirReduction.dirReduc(new String[]{"WEST","EAST"}));
        assertArrayEquals(new String[]{}, DirReduction.dirReduc(new String[]{"EAST","WEST"}));
        assertArrayEquals(new String[]{}, DirReduction.dirReduc(new String[]{"NORTH","SOUTH"}));
        assertArrayEquals(new String[]{}, DirReduction.dirReduc(new String[]{"SOUTH","NORTH"}));
        assertArrayEquals(new String[]{"WEST"}, DirReduction.dirReduc(new String[]{"WEST","SOUTH","NORTH"}));
        assertArrayEquals(new String[]{}, DirReduction.dirReduc(new String[]{"WEST","EAST","SOUTH","NORTH"}));
        assertArrayEquals(new String[]{}, DirReduction.dirReduc(new String[]{"NORTH","EAST","WEST","SOUTH"}));
        assertArrayEquals(new String[]{"SOUTH", "SOUTH", "SOUTH", "EAST", "EAST", "NORTH"},DirReduction.dirReduc(new String[]{"SOUTH", "SOUTH", "SOUTH", "EAST", "WEST", "EAST", "EAST", "NORTH", "EAST", "WEST"}));
        assertArrayEquals(new String[]{"WEST"}, DirReduction.dirReduc(new String[]{"WEST","EAST","WEST"}));
        assertArrayEquals(new String[]{"SOUTH"}, DirReduction.dirReduc(new String[]{"SOUTH","NORTH","SOUTH"}));
        assertArrayEquals(new String[]{"NORTH"}, DirReduction.dirReduc(new String[]{"NORTH","SOUTH","NORTH"}));
    }

}