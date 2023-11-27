package multipleOf3or5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void shouldAddTogetherMultipleOf3And5(){
        Solution solution = new Solution();
        assertEquals(0, solution.solution(1));
        assertEquals(3, solution.solution(4));
        assertEquals(8, solution.solution(6));
        assertEquals(23, solution.solution(10));
    }

}