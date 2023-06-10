package duplicateEncoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEncoderTest {
    @Test
    void shouldEncode(){
        assertEquals("",DuplicateEncoder.encode(""));
        assertEquals("(",DuplicateEncoder.encode("d"));
        assertEquals("((",DuplicateEncoder.encode("di"));
        assertEquals("))",DuplicateEncoder.encode("dd"));
        assertEquals("))",DuplicateEncoder.encode("dD"));
        assertEquals(")())())",DuplicateEncoder.encode("Success"));
        assertEquals("))((" ,DuplicateEncoder.encode("(( @"));
    }

}