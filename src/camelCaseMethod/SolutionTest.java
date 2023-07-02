package camelCaseMethod;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void shouldTransformTheStringIntoCamelCase(){
        assertEquals("", Solution.camelCase(""));
        assertEquals("A", Solution.camelCase("a"));
        assertEquals("Ab", Solution.camelCase("ab"));
        assertEquals("CamelCaseMethod", Solution.camelCase("camel case method"));
        assertEquals("CamelCaseMethod", Solution.camelCase(" camel case method"));
        assertEquals("CamelCaseMethod", Solution.camelCase(" camel  case method"));
    }
}