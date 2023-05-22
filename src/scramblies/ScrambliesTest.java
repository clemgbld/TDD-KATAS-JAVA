package scramblies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrambliesTest {
    @Test
    void shouldScramble(){
       assertFalse(Scramblies.scramble("a","b"));
       assertTrue(Scramblies.scramble("a","a"));
       assertTrue(Scramblies.scramble("ab","a"));
       assertTrue(Scramblies.scramble("rkqodlw","world"));
       assertTrue(Scramblies.scramble("cedewaraaossoqqyt", "codewars"));
    }

}