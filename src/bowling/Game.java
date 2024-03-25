package bowling;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {

    List<Integer> scoreBoard = new ArrayList<>(Collections.nCopies(22, 0));
    private int rollIndex = 0;

    public void roll(int pinsKnockDown) {
        if(isStrike()){
            addStrikeBonus(pinsKnockDown);
        }
        if(isSpare()){
            addSpareBonus(pinsKnockDown);
        }
        addToScoreBoard(pinsKnockDown);

    }

    private void addStrikeBonus(int pinsKnockDown) {
        scoreBoard.set(rollIndex - 2, scoreBoard.get(rollIndex - 2) + scoreBoard.get(rollIndex - 1) + pinsKnockDown);
    }

    public int score() {
        return scoreBoard.stream()
                .mapToInt(i -> i)
                .sum();
    }

    private void addToScoreBoard(int p) {
        scoreBoard.set(rollIndex, p);
        rollIndex++;
    }

    private void addSpareBonus(int pinsKnockDown) {
        scoreBoard.set(rollIndex - 1, scoreBoard.get(rollIndex -1) + pinsKnockDown);
    }

    private boolean isSpare() {
        return rollIndex > 0 && rollIndex % 2 == 0 && (scoreBoard.get(rollIndex - 2) + scoreBoard.get(rollIndex - 1)) == 10;
    }

    private boolean isStrike() {
        return rollIndex > 1 && rollIndex % 2 == 0 && scoreBoard.get(rollIndex - 2) == 10;
    }


}
