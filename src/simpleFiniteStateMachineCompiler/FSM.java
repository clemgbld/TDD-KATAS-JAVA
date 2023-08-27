package simpleFiniteStateMachineCompiler;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FSM {
    private final List<String> transitions = new ArrayList<>();

    private final Map<String,State> stateMap;

    public FSM(String instructions) {
        this.stateMap = buildStateMap(instructions);
    }

    public Result runFSM(String start, int[] sequence) {
        addTransitions(start, sequence);
        State currentState = getCurrentState();
        return new Result(currentState.getName(),currentState.getValue(),transitions.toArray(String[]::new));
    }

    private void addTransitions(String start, int[] sequence) {
        transitions.add(start);
        Arrays.stream(sequence).forEach(i ->{
            State currentState = getCurrentState();
            transitions.add(currentState.getNextState(i));
        });
    }

    private State getCurrentState() {
        return stateMap.get(transitions.get(transitions.size() - 1));
    }

    private Map<String, State> buildStateMap(String instructions) {
        return Arrays.stream(instructions.split("\\n"))
                .map(State::new)
                .collect(Collectors.toMap(State::getName, Function.identity()));
    }
}

  class State {
    private final String name;

    private final int value;

    private final String nextStateRight;

    private final String nextStateLeft;



    public State(String instruction) {
        String[] instructionsArr = instruction.split(";");
        this.name = buildName(instructionsArr);
        this.value = buildValue(instructionsArr);
        this.nextStateRight = buildNextStateRight(instructionsArr);
        this.nextStateLeft = buildNextStateLeft(instructionsArr);
    }



      public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public String getNextState(int sequenceValue) {
        return sequenceValue == 0 ? nextStateLeft : nextStateRight;
    }


    private String buildName(String[] instructionsArr){
        return instructionsArr[0];
    }

    private int buildValue(String[] instructionsArr){
        return Integer.parseInt(instructionsArr[2].trim());
    }

    private String buildNextStateRight(String[] instructionsArr){
        return buildNextState(instructionsArr, 1);
    }

      private String buildNextStateLeft(String[] instructionsArr) {
          return buildNextState(instructionsArr, 0);
      }

      private static String buildNextState(String[] instructionsArr, int stateSide) {
          return instructionsArr[1].split(",")[stateSide].trim();
      }
  }



