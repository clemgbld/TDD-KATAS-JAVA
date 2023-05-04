package mazeRunner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MazeRunnerTest {
    @Test
    void shouldFinishTheMazeWithOneDirectionInTheSouth(){
        int[][] maze = {
                {0,2},{1,3}
        };

        String[] directions = {"S"};

        assertEquals("Finish", MazeRunner.walk(maze,directions));
    }

    @Test
    void shouldFindTheFirstPositionDynamicallyForOneDirectionInTheSouth(){
        int[][] maze = {
                {2,0},{3,1}
        };

        String[] directions = {"S"};

        assertEquals("Finish", MazeRunner.walk(maze,directions));
    }

    @Test
    void shouldFinishTheMazeWithOneDirectionInTheNorth(){
        int[][] maze = {
                {0,3},{1,2}
        };

        String[] directions = {"N"};

        assertEquals("Finish", MazeRunner.walk(maze,directions));
    }

    @Test
    void shouldFindTheFirstPositionDynamicallyForOneDirectionInTheNorth(){
        int[][] maze = {
                {3,0},{2,1}
        };

        String[] directions = {"N"};

        assertEquals("Finish", MazeRunner.walk(maze,directions));
    }

    @Test
    void shouldFinishTheMazeWithOneDirectionInTheWest(){
        int[][] maze = {
                {3,2},{1,1}
        };

        String[] directions = {"W"};

        assertEquals("Finish", MazeRunner.walk(maze,directions));
    }

    @Test
    void shouldFindTheFirstPositionDynamicallyForOneDirectionInTheWest(){
        int[][] maze = {
                {1,1},{3,2}
        };

        String[] directions = {"W"};

        assertEquals("Finish", MazeRunner.walk(maze,directions));
    }

    @Test
    void shouldFinishTheMazeWithOneDirectionInTheEast(){
        int[][] maze = {
                {1,1},{2,3}
        };

        String[] directions = {"E"};

        assertEquals("Finish", MazeRunner.walk(maze,directions));
    }

    @Test
    void shouldFindTheFirstPositionDynamicallyForOneDirectionInTheEast(){
        int[][] maze = {
                {2,3},{1,1}
        };

        String[] directions = {"E"};

        assertEquals("Finish", MazeRunner.walk(maze,directions));
    }

    @Test
    void shouldBeDeadWithOneDirection(){
        int[][] maze = {
                {0,2},{3,1}
        };

        String[] directions = {"S"};

        assertEquals("Dead", MazeRunner.walk(maze,directions));
    }

    @Test
    void shouldBeDeadWhenItGoesOutOfTheMazeBound(){
        int[][] maze = {
                {2,3},{1,1}
        };

        String[] directions = {"W"};

        assertEquals("Dead", MazeRunner.walk(maze,directions));
    }


    @Test
    void shouldBeLostWhenTheNavigatorIsOUtOfMoveAndDidNotFindTheFinishLine(){
        int[][] maze = {
                {2,0},{0,3}
        };

        String[] directions = {"E"};

        assertEquals("Lost", MazeRunner.walk(maze,directions));
    }

    @Test
    void acceptanceTest(){
        int[][] maze = {
                { 1, 1, 1, 1, 1, 1, 1 },
                { 1, 0, 0, 0, 0, 0, 3 },
                { 1, 0, 1, 0, 1, 0, 1 },
                { 0, 0, 1, 0, 0, 0, 1 },
                { 1, 0, 1, 0, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 1 },
                { 1, 2, 1, 0, 1, 0, 1 } };

        String[] directions = { "N", "N", "N", "N", "N", "E", "E", "E", "E", "E" };

        assertEquals("Finish", MazeRunner.walk(maze,directions));

    }




}