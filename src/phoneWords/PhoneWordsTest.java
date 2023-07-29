package phoneWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneWordsTest {
    @Test
    void shouldTransformNumberInAppropriateLetter(){
        assertEquals("a",PhoneWords.phoneWords("2"));
        assertEquals("d",PhoneWords.phoneWords("3"));
        assertEquals("g",PhoneWords.phoneWords("4"));
        assertEquals("",PhoneWords.phoneWords(null));
        assertEquals("ad",PhoneWords.phoneWords("23"));
        assertEquals("a",PhoneWords.phoneWords("21"));
        assertEquals("b",PhoneWords.phoneWords("22"));
        assertEquals("c",PhoneWords.phoneWords("222"));
        assertEquals("cd",PhoneWords.phoneWords("2223"));
        assertEquals("ca",PhoneWords.phoneWords("2222"));
        assertEquals("  ",PhoneWords.phoneWords("00"));
        assertEquals("apple", PhoneWords.phoneWords("271755533"));
        assertEquals("hello how are you", PhoneWords.phoneWords("443355555566604466690277733099966688"));


    }

}