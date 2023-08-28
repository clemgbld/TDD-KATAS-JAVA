package dataReverse;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    void shouldReverseData(){
        assertArrayEquals(new int[]{0,0,0,0,0,0,0,0},Kata.DataReverse(new int[]{0,0,0,0,0,0,0,0}));
        int[] data1= {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
        int[] data2= {1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
        assertArrayEquals(data2, Kata.DataReverse(data1));
    }





}