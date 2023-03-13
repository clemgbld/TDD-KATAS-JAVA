package reverseOrRotate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RevRotTest {
    @Test
    public void shouldReverseOrRotateStringNumber(){
        assertEquals("",RevRot.revRot("",8));
        assertEquals("234561",RevRot.revRot("123456",6));
        assertEquals("23456771",RevRot.revRot("12345677",8));
        assertEquals("234561234561",RevRot.revRot("123456123456",6));
        assertEquals("21121221",RevRot.revRot("12212112",2));
        assertEquals("",RevRot.revRot("1234", 5));
        assertEquals("",RevRot.revRot("1234", 0));
        assertEquals("4466",RevRot.revRot("6644", 4));
        assertEquals("6644",RevRot.revRot("4466", 4));
        assertEquals("0365065073456944",RevRot.revRot("563000655734469485",4));
    }

}