package tickTacToeChecker;

public class Solution {
    public static final int PLAYER_ONE = 1;
    public static final int GAME_NOT_FINISHED = -1;
    public static final int PLAYER_TWO = 2;
    public static final int DRAW = 0;

    public static int isSolved(int[][] board) {
        if (hasPlayerWon(board,PLAYER_ONE)) {
            return PLAYER_ONE;
        }

        if (hasPlayerWon(board, PLAYER_TWO)){
            return PLAYER_TWO;
        }

        for(int[] boardLine :  board){
            for (int boardCase : boardLine){
               if(boardCase == 0) return GAME_NOT_FINISHED;
            }
        }

        return DRAW;
    }

    private static boolean hasPlayerWon(int[][] board,int player) {
        return isHorizontalLineSolved(board,0,player)
                || isHorizontalLineSolved(board,1,player)
                || isHorizontalLineSolved(board,2,player)
                || isVerticalLineSolved(board,0,player)
                || isVerticalLineSolved(board,1,player)
                || isVerticalLineSolved(board,2,player)
                || isDiagonalLineSolved(board,player);
    }


    private static boolean isVerticalLineSolved(int[][] board,int column, int player) {
        return board[0][column] == player && board[1][column] == player && board[2][column] == player;
    }

    private static boolean isHorizontalLineSolved( int [][] board, int line,int player){
        return board[line][0] == player && board[line][1] == player && board[line][2] == player;
    }

    private static boolean isDiagonalLineSolved(int [][] board,int player){
        return board[0][0] == player && board[1][1] == player & board[2][2] == player
                || board[0][2] == player && board[1][1] == player & board[2][0] == player;
    }
}
