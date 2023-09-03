package ascendDescendRepeat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AscendDescendTest {
    @Test
    void shouldAscendDescendRepeat() {
        assertEquals("1", AscendDescend.ascendDescend(1, 1, 1));
        assertEquals("2", AscendDescend.ascendDescend(1, 2, 2));
        assertEquals("12", AscendDescend.ascendDescend(2, 1, 2));
        assertEquals("123", AscendDescend.ascendDescend(3, 1, 3));
        assertEquals("121", AscendDescend.ascendDescend(3, 1, 2));
        assertEquals("1212", AscendDescend.ascendDescend(4, 1, 2));
        assertEquals("1111", AscendDescend.ascendDescend(4, 1, 1));
        assertEquals("56789876567", AscendDescend.ascendDescend(11, 5, 9));
        assertEquals("", AscendDescend.ascendDescend(11, 9, 5));
        assertEquals("53653753853954054154254354454554654754854955055155255355455555655755855956056156256356456556656756856957057157257357457557657757857958058158258358458558658758858959059159259359459559659759859960060160260360460560660760860961061161261361461561661761861962062162262362462562662762862963063163263363463563663763863964064164264364464564664764864965065165265365465565665765865966066166266366466566666766866967067167267367467567667767867",AscendDescend.ascendDescend(431, 536, 962));
    }

}