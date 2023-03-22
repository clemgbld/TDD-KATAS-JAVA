package findTheUniqueNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    public void shouldFindTheUniqueNumber(){
        assertEquals(2.00,Kata.findUniq(new double[]{1,2,1}));
        assertEquals(5.00,Kata.findUniq(new double[]{1,5,1}));
        assertEquals(2.00,Kata.findUniq(new double[]{2,1,1}));
    }

}