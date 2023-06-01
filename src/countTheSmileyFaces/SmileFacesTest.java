package countTheSmileyFaces;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SmileFacesTest {
    @Test
    void shouldCountTheNumberOfSmileyFaces(){
        assertEquals(0,SmileFaces.countSmileys(List.of(";(")));
        assertEquals(1,SmileFaces.countSmileys(List.of(":)")));
        assertEquals(1,SmileFaces.countSmileys(List.of(";)")));
        assertEquals(1,SmileFaces.countSmileys(List.of(";D")));
        assertEquals(1,SmileFaces.countSmileys(List.of(";-D")));
        assertEquals(1,SmileFaces.countSmileys(List.of(":~)")));
        assertEquals(3,SmileFaces.countSmileys(List.of(";D", ":-(", ":-)", ";~)")));
    }

}