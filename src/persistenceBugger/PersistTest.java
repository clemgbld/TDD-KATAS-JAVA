package persistenceBugger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersistTest {
    @Test
    void shouldCalcPersistenceNumber(){
        assertEquals(0,Persist.persistence(4L));
        assertEquals(1,Persist.persistence(22L));
        assertEquals(3,Persist.persistence(39L));
    }

}