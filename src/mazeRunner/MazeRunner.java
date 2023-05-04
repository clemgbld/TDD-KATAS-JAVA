package mazeRunner;

import java.awt.*;
import java.util.stream.IntStream;

public class MazeRunner {

    public static final String FINISH = "Finish";
    public static final String DEAD = "Dead";
    public static final int FINISH_POINT = 3;
    public static final int STARTING_POINT = 2;
    public static final String LOST = "Lost";
    public static final int WALL = 1;


    public static String walk(int[][] maze, String[] directions) {

        Coordinate position = findCoordinate(maze, STARTING_POINT);

        for (String direction : directions) {
            try {
                position = position.move(direction);
                if (maze[position.getLocation().y][position.getLocation().x] == FINISH_POINT) {
                    return FINISH;
                }

                if (maze[position.getLocation().y][position.getLocation().x] == WALL) {
                    return DEAD;
                }

            } catch (ArrayIndexOutOfBoundsException e) {
                return DEAD;
            }
        }
        return LOST;
    }


    private static Coordinate findCoordinate(int[][] matrix, int target) {
        return IntStream.range(0, matrix.length)
                .boxed()
                .flatMap(y -> IntStream.range(0, matrix[y].length)
                        .filter(x -> matrix[y][x] == target)
                        .mapToObj(x -> new Coordinate(x, y))
                ).findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Target not found"));
    }

    public static class Coordinate extends Point {
        public static final String S = "S";
        public static final String W = "W";
        public static final String E = "E";

        public Coordinate(int x, int y) {
            super(x, y);
        }

        public Coordinate move(String direction) {
            switch (direction) {
                case S -> setLocation(x, y + 1);
                case W -> setLocation(x - 1, y);
                case E -> setLocation(x + 1, y);
                default -> setLocation(x, y - 1);
            }
            return this;
        }
    }
}








