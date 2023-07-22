package morseCodeDecoderAdvanced;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MorseCodeDecoderTest {
    @Test
    void shouldTranslateMorseCodeToSentence(){
        assertEquals("H", morseCodeDecoder.MorseCodeDecoder.decode("...."));
        assertEquals("E", morseCodeDecoder.MorseCodeDecoder.decode("."));
        assertEquals("HEY", morseCodeDecoder.MorseCodeDecoder.decode(".... . -.--"));
        assertEquals("HEY JUDE", morseCodeDecoder.MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
        assertEquals("E", MorseCodeDecoder.decodeMorse("   ."));
    }

    @Test
    void shouldTranslateBitsToMorseCode(){
        assertEquals(".",MorseCodeDecoder.decodeBits("1"));
        assertEquals("....",MorseCodeDecoder.decodeBits("10101010"));
       assertEquals(". -",MorseCodeDecoder.decodeBits("1000111"));
      assertEquals(".   -",MorseCodeDecoder.decodeBits("10000000111"));
      assertEquals(".... . -.--   .--- ..- -.. .",MorseCodeDecoder.decodeBits("1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011"));
      assertEquals("..   -",MorseCodeDecoder.decodeBits("111000111000000000000000000000111111111"));
      assertEquals(".. -",MorseCodeDecoder.decodeBits("111000111000000000111111111"));
      assertEquals(".",MorseCodeDecoder.decodeBits(" 1"));
      assertEquals(".",MorseCodeDecoder.decodeBits("01110"));
    }



}