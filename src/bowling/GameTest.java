package bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

   @Test
    void shouldMakeABlankGame(){
       Game game = new Game();
       rollMany(game, 0, 20);
       assertEquals(game.score(), 0);
    }

    @Test
    void shouldKnockDown1PinInEachFrame(){
        Game game = new Game();
        rollMany(game, 1, 20);
        assertEquals(game.score(), 20);
    }


    @Test
    void shouldCalcSpare(){
        Game game = new Game();
        game.roll(6);
        game.roll(4);
        game.roll(3);
        game.roll(7);
        game.roll(1);
        rollMany(game, 0, 15);
        assertEquals(game.score(), 25);
    }

    @Test
    void shouldCalcAStrike(){
        Game game = new Game();
        game.roll(10);
        game.roll(4);
        game.roll(3);
        rollMany(game, 0, 17);
        assertEquals(game.score(), 24);
    }

    @Test
    void shouldBeAPerfectGame(){
        Game game = new Game();
        rollMany(game, 10, 22);
        assertEquals(game.score(), 300);
    }



    private static void rollMany(Game game, int pointScoredInEachFrame, int numberOrRoll) {
        for (int i = 0; i < numberOrRoll; i++) {
            game.roll(pointScoredInEachFrame);
        }
    }


}
