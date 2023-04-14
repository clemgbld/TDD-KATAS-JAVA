package findTheParityOutlier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindOutlierTest {

    @Test
    void shouldFindTheOutlier(){
        assertEquals(1,FindOutlier.find(new int[]{1,2,6}));
        assertEquals(3,FindOutlier.find(new int[]{3,2,6}));
        assertEquals(3,FindOutlier.find(new int[]{2,3,6}));
        assertEquals(6,FindOutlier.find(new int[]{1,3,6}));
    }

}