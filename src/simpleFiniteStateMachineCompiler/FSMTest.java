package simpleFiniteStateMachineCompiler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FSMTest {


    @Test
    void shouldGiveTheCurrentStateTheCurrentValueAndAllStateTransition(){
        assertEquals(new Result("S1",9,"S1"),new FSM("S1; S1, S2; 9\n").runFSM("S1",new int[]{}));
        assertEquals(new Result("S2",10,"S2"),new FSM("S2; S2, S1; 10\n").runFSM("S2",new int[]{}));
        assertEquals(new Result("S1",9,"S2","S1"),new FSM("S2; S2, S1; 10\nS1; S1, S2; 9\n").runFSM("S2",new int[]{1}));
        assertEquals(new Result("S2",10,"S1","S2"),new FSM("S2; S2, S1; 10\nS1; S1, S2; 9\n").runFSM("S1",new int[]{1}));
        assertEquals(new Result("S1",9,"S1","S1"),new FSM("S2; S2, S1; 10\nS1; S1, S2; 9\n").runFSM("S1",new int[]{0}));
        assertEquals(new Result("S2",10,"S1","S2"),new FSM("S2; S2, S1; 10\nS1; S2, S2; 9\n").runFSM("S1",new int[]{0}));
        assertEquals(new Result("S1", 9, "S1", "S1", "S2", "S3", "S4", "S1"), new FSM("S1; S1, S2; 9\nS2; S1, S3; 10\nS3; S4, S3; 8\nS4; S4, S1; 0").runFSM("S1", new int[]{0, 1, 1, 0, 1}));
    }



}