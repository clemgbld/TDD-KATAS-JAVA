package doesMyNumberLooksBigInThis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    @Test
    void shouldBeNarcissistic(){
        assertTrue(NumberUtils.isNarcissistic(1));
        assertTrue(NumberUtils.isNarcissistic(2));
        assertTrue(NumberUtils.isNarcissistic(153));
        assertTrue(NumberUtils.isNarcissistic(1634));
    }

}