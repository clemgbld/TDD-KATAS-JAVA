package bowling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void shouldPlayAGutterGame(){
        Game game = new Game();
        rollMany(game, 0, 20);

        assertEquals(0,game.score());
    }

    @Test
    void shouldMakeASpareAndThenMissAll(){
        Game game = new Game();
        game.roll(5);
        game.roll(5);
        game.roll(1);
        rollMany(game, 0, 17);

        assertEquals(12,game.score());
    }

    @Test
    void shouldMakeAStrikeAndThenMissAll(){
        Game game = new Game();
        game.roll(10);
        game.roll(5);
        game.roll(1);
        rollMany(game, 0, 16);

        assertEquals(22,game.score());
    }

    @Test
    void shouldMakeAPerfectGame(){
        Game game = new Game();

        rollMany(game, 10, 12);

        assertEquals(300,game.score());
    }

    @Test
    void shouldPlayABeginnerGame(){
        Game game = new Game();
        rollMany(game, 1, 20);

        assertEquals(20,game.score());
    }


    private static void rollMany(Game game, int pins, int rolls) {
        for (int i = 0; i < rolls; i++) {
            game.roll(pins);
        }
    }


}