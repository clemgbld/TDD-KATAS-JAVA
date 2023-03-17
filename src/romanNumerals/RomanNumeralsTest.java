package romanNumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @Test
    public void shouldConvertRomanToArabic(){
        assertEquals(0,RomanNumerals.romanToArabic(""));
        assertEquals(1,RomanNumerals.romanToArabic("I"));
        assertEquals(5,RomanNumerals.romanToArabic("V"));
        assertEquals(10,RomanNumerals.romanToArabic("X"));
        assertEquals(2,RomanNumerals.romanToArabic("II"));
        assertEquals(3,RomanNumerals.romanToArabic("III"));
        assertEquals(4,RomanNumerals.romanToArabic("IV"));
        assertEquals(9,RomanNumerals.romanToArabic("IX"));
        assertEquals(22,RomanNumerals.romanToArabic("XXII"));
        assertEquals(4444,RomanNumerals.romanToArabic("MMMMCDXLIV"));
    }

}