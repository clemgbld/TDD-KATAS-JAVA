package whoWonTheElection;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BallotsCounterTest {
    @Test
    void shouldFindWhoWonTheElection(){
        assertEquals(null, BallotsCounter.getWinner(List.of()));
        assertEquals("A", BallotsCounter.getWinner(List.of("A", "A", "A", "B", "B")));
        assertEquals(null,BallotsCounter.getWinner(List.of("A", "A", "B", "B")));
    }

}