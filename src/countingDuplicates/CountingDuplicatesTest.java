package countingDuplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingDuplicatesTest {
    @Test
    public void shouldCountDuplicates(){
        assertEquals(0,CountingDuplicates.duplicateCount(""));
        assertEquals(1,CountingDuplicates.duplicateCount("aa"));
        assertEquals(0,CountingDuplicates.duplicateCount("a"));
        assertEquals(1,CountingDuplicates.duplicateCount("bb"));
        assertEquals(1,CountingDuplicates.duplicateCount("Bb"));
        assertEquals(2,CountingDuplicates.duplicateCount("bbaac"));
    }

}