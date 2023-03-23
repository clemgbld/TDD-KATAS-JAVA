package weightForWeight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeightSortTest {
    @Test
    public void shouldOrderNumbersStringByDigitSum(){
        assertEquals("1 2",WeightSort.orderWeight("1 2"));
        assertEquals("1 2",WeightSort.orderWeight("2 1"));
        assertEquals("1 2",WeightSort.orderWeight(" 1 2"));
        assertEquals("1 2",WeightSort.orderWeight(" 1   2"));
        assertEquals("11 3",WeightSort.orderWeight("11 3"));
        assertEquals("11 2",WeightSort.orderWeight("2 11"));
        assertEquals("1 2 3",WeightSort.orderWeight("3 2 1"));
    }

}