package splitStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSplitTest {
    @Test
    void shouldSplitStringsByPair(){
        assertArrayEquals(new String[]{},StringSplit.solution(""));
        assertArrayEquals(new String[]{"ab"},StringSplit.solution("ab"));
        assertArrayEquals(new String[]{"ab","cd"},StringSplit.solution("abcd"));
        assertArrayEquals(new String[]{"a_"},StringSplit.solution("a"));
        assertArrayEquals(new String[]{"ab", "cd", "ef"},StringSplit.solution("abcdef"));
    }

}