package writeNumberInExpandedForm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void shouldWriteNumberInExpandedForm(){
        assertEquals("0", Kata.expandedForm(0));
        assertEquals("1", Kata.expandedForm(1));
        assertEquals("10 + 2", Kata.expandedForm(12));
        assertEquals("10 + 3", Kata.expandedForm(13));
        assertEquals("20 + 3", Kata.expandedForm(23));
        assertEquals("200 + 3", Kata.expandedForm(203));
        assertEquals("200 + 10 + 3", Kata.expandedForm(213));
        assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
    }

}