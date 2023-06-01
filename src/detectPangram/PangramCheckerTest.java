package detectPangram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PangramCheckerTest {
 @Test
    void shouldCheckIfItIsAPangram(){
     PangramChecker pc = new PangramChecker();
     assertFalse(pc.check("You shall not pass!"));
     assertTrue(pc.check("azertyuiopqsdfghjklmwxcvbn"));
     assertTrue(pc.check("the quick brown fox jumps over the lazy dog"));
     assertTrue(pc.check("The quick brown fox jumps over the lazy dog."));
     assertTrue(pc.check("ABCD45EFGH,IJK,LMNOPQR56STUVW3XYZ"));
 }
}