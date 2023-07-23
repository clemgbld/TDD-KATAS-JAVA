package stripComments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StripCommentsTest {
    @Test
    void shouldStripComments(){
        assertEquals("apples",StripComments.stripComments("apples",new String[]{"#"}));
        assertEquals("orange",StripComments.stripComments("orange",new String[]{"#"}));
        assertEquals("a\nc\nd",StripComments.stripComments("a#c\nc\nd",new String[]{"#"}));
        assertEquals("a\nc\nd",StripComments.stripComments("a#d\nc\nd",new String[]{"#"}));
        assertEquals("a\nc\nd",StripComments.stripComments("a!d\nc\nd!b",new String[]{"!"}));
        assertEquals("a\nc\nd",StripComments.stripComments("a!D\nc\nd!b",new String[]{"!"}));
        assertEquals("a\nc\nd",StripComments.stripComments("a!1\nc\nd!b",new String[]{"!"}));
        assertEquals("apples, pears\ngrapes\nbananas",StripComments.stripComments("apples, pears # and bananas\ngrapes\nbananas #apples",new String[]{"#"}));
        assertEquals("a\nc\nd",StripComments.stripComments("a!\nc\nd!b",new String[]{"!"}));
        assertEquals(
                "apples, pears\ngrapes\nbananas",
                StripComments.stripComments( "apples, pears # and bananas\ngrapes\nbananas !apples", new String[] { "#", "!" } )
        );
        assertEquals(
                "a\nc\nd",
                StripComments.stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } )
        );
        assertEquals("a\n b\nc",StripComments.stripComments("a\n b\nc",new String[]{"#","$"}));
        assertEquals("",StripComments.stripComments("a",new String[]{"a"}));
        assertEquals("a\nb\n",StripComments.stripComments("a-b\nb\n-",new String[]{"-"}));
        assertEquals("a\nb\n\n",StripComments.stripComments("a-b\nb\n\n-",new String[]{"-"}));


    }

}