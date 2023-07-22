package morseCodeDecoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeDecoderTest {
    @Test
    void shouldTranslateMorseCode(){
        assertEquals("H",MorseCodeDecoder.decode("...."));
        assertEquals("E",MorseCodeDecoder.decode("."));
        assertEquals("HEY",MorseCodeDecoder.decode(".... . -.--"));
        assertEquals("HEY JUDE",MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
        assertEquals("E", MorseCodeDecoder.decode("   ."));
    }

}