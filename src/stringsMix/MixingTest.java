package stringsMix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MixingTest {
    @Test
    void shouldMixStrings(){
       assertEquals("",Mixing.mix("a","b"));
       assertEquals("1:aa",Mixing.mix("aa",""));
       assertEquals("",Mixing.mix("&&",""));
       assertEquals("1:aaaa",Mixing.mix("aaaa",""));
       assertEquals("1:aaaa/1:bb",Mixing.mix("aaaa .bbA",""));
       assertEquals("1:aaaa/1:bbbb",Mixing.mix("aaaabbbb",""));
       assertEquals("2:eeeee/1:tt",Mixing.mix("tt","eee ^ee"));
       assertEquals("=:aaaa",Mixing.mix("aaaa","aaaa"));
       assertEquals("1:aaa",Mixing.mix("aaa","aa"));
       assertEquals("2:aaa",Mixing.mix("aa","aaa"));
        assertEquals("2:eeeee/2:yy/=:hh/=:rr", Mixing.mix("Are they here", "yes, they are here"));
    }

}