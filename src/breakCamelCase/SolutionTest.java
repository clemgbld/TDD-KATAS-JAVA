package breakCamelCase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void shouldBreakCamelCase(){
        assertEquals("", Solution.camelCase(""));
        assertEquals("identifier", Solution.camelCase("identifier"));
        assertEquals("camel Casing", Solution.camelCase("camelCasing"));
        assertEquals("camel Casing Done", Solution.camelCase("camelCasingDone"));
    }

}