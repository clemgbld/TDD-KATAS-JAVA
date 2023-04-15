package tickTacToeChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void shouldBeMinusOneWhenTheGameIsNotFinished() {
        var notFinishedBoard = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertEquals(-1, Solution.isSolved(notFinishedBoard));

        notFinishedBoard = new int[][]{{1, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertEquals(-1, Solution.isSolved(notFinishedBoard));

        notFinishedBoard = new int[][]{{1, 1, 0}, {0, 0, 0}, {2, 0, 0}};
        assertEquals(-1, Solution.isSolved(notFinishedBoard));

        notFinishedBoard = new int[][]{{1, 1, 0}, {1, 0, 0}, {2, 0, 2}};
        assertEquals(-1, Solution.isSolved(notFinishedBoard));

        notFinishedBoard = new int[][]{{1, 2, 0}, {1, 1, 0}, {2, 0, 2}};
        assertEquals(-1, Solution.isSolved(notFinishedBoard));

        notFinishedBoard = new int[][]{{1, 2, 0}, {2, 2, 0}, {1, 0, 0}};
        assertEquals(-1, Solution.isSolved(notFinishedBoard));

        notFinishedBoard = new int[][]{{1, 2, 0}, {2, 2, 0}, {1, 1, 0}};
        assertEquals(-1, Solution.isSolved(notFinishedBoard));
    }


    @Test
    void shouldBe1WhenPlayer1sWonTheGame(){
        var oneWonBoard = new int[][]{{1, 1, 1}, {0, 2, 0}, {0, 0, 2}};
        assertEquals(1, Solution.isSolved(oneWonBoard));

         oneWonBoard = new int[][]{{2, 0, 2}, {1, 1, 1}, {0, 0, 0}};
        assertEquals(1, Solution.isSolved(oneWonBoard));

        oneWonBoard = new int[][]{{2, 0, 2}, {0, 0, 0}, {1, 1, 1}};
        assertEquals(1, Solution.isSolved(oneWonBoard));

        oneWonBoard = new int[][]{{1, 0, 2}, {1, 0, 0}, {1, 2, 2}};
        assertEquals(1, Solution.isSolved(oneWonBoard));

        oneWonBoard = new int[][]{{0, 1, 2}, {0, 1, 0}, {2, 1, 2}};
        assertEquals(1, Solution.isSolved(oneWonBoard));

        oneWonBoard = new int[][]{{0, 2, 1}, {0, 0, 1}, {2, 2, 1}};
        assertEquals(1, Solution.isSolved(oneWonBoard));

        oneWonBoard = new int[][]{{1, 2, 0}, {0, 1, 0}, {2, 2, 1}};
        assertEquals(1, Solution.isSolved(oneWonBoard));

        oneWonBoard = new int[][]{{0, 2, 1}, {0, 1, 0}, {1, 2, 2}};
        assertEquals(1, Solution.isSolved(oneWonBoard));
    }

    @Test
    void shouldBe2WhenPlayer2WonTheGame(){
        var twoOneTheGame = new int[][]{{0, 1, 2}, {0, 2, 0}, {2, 1, 1}};
        assertEquals(2, Solution.isSolved(twoOneTheGame));
    }

    @Test
    void shouldBeZeroWhenTheGameIsADraw(){
        var drawGame = new int[][]{{1, 2, 1},{1, 1, 2},{2, 1, 2}};
        assertEquals(0, Solution.isSolved(drawGame));
    }



    
    

}