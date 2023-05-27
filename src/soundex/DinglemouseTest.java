package soundex;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DinglemouseTest {


    @Test
    void shouldApplySoundex(){
       assertEquals("",Dinglemouse.soundex(""));
        assertEquals("S123",Dinglemouse.soundex("Sbcd"));
        assertEquals("S123",Dinglemouse.soundex("Sbcdhb"));
        assertEquals("S123",Dinglemouse.soundex("SbCd"));
        assertEquals("S123",Dinglemouse.soundex("Sbbcd"));
        assertEquals("S600",Dinglemouse.soundex("Sarah"));
        assertEquals("M621",Dinglemouse.soundex("Marsupilami"));
        assertEquals("S600 C560", Dinglemouse.soundex("Sayra Cunnarr"));
        assertEquals("K400",Dinglemouse.soundex("kwl"));
        assertEquals("B425",Dinglemouse.soundex("blczzciomicpfgbry"));
        assertEquals("T522",Dinglemouse.soundex("Tymczak"));
        assertEquals("A261",Dinglemouse.soundex("AsHcraft"));
        assertEquals("W000",Dinglemouse.soundex("w"));
    }

}