package bowling;


import java.util.ArrayList;
import java.util.List;

public class Game {
    public static final int FRAMES_NUMBER = 10;
    public static final int ALL_PINS_KNOCKED = 10;
    private final List<Integer> rolls = new ArrayList<>();

    public void roll(int pins) {
      rolls.add(pins);
    }

    public int score() {
        int total = 0;
        int rollIndex = 0;
       for (int i = 0; i < FRAMES_NUMBER; i++){
           if(isStrike(rollIndex)){
               total+= rolls.get(rollIndex) + rolls.get(rollIndex + 1) + rolls.get(rollIndex + 2);
              rollIndex+=1;
           }
           else if(isSpare(rollIndex)){
               total+= rolls.get(rollIndex) + rolls.get(rollIndex + 1) + rolls.get(rollIndex + 2) ;
               rollIndex+=2;
           }else {
               total+= rolls.get(rollIndex) + rolls.get(rollIndex + 1);
               rollIndex+=2;
           }

       }

       return total;
    }

    private boolean isStrike(int rollIndex) {
        return rolls.get(rollIndex) == ALL_PINS_KNOCKED;
    }


    private boolean isSpare(int rollIndex) {
        return rolls.get(rollIndex) + rolls.get(rollIndex + 1) == ALL_PINS_KNOCKED;
    }

}
