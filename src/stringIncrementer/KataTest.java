package stringIncrementer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    void shouldIncrementString(){
        assertEquals("foo2",Kata.incrementString("foo1"));
        assertEquals("foo3",Kata.incrementString("foo2"));
        assertEquals("foo20",Kata.incrementString("foo19"));
        assertEquals("1",Kata.incrementString(""));
        assertEquals("foo1",Kata.incrementString("foo"));
        assertEquals("foo02",Kata.incrementString("foo01"));
        assertEquals("foo100",Kata.incrementString("foo099"));
        assertEquals("foo100",Kata.incrementString("foo99"));
        assertEquals("foobar001",Kata.incrementString("foobar000"));
        assertEquals("fo2o2",Kata.incrementString("fo2o1"));
        assertEquals("70556836174930005132",Kata.incrementString("70556836174930005131"));
    }

}