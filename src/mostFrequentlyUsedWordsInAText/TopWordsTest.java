package mostFrequentlyUsedWordsInAText;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TopWordsTest {
    @Test
    void shouldFindTheTop3WordsInAText(){
        assertEquals(List.of(),TopWords.top3(""));
        assertEquals(List.of("e"),TopWords.top3("e"));
        assertEquals(List.of("e"),TopWords.top3("E"));
        assertEquals(List.of(),TopWords.top3("'"));
        assertEquals(List.of("income"),TopWords.top3("income."));
        assertEquals(List.of("''a"),TopWords.top3("''a"));

        assertEquals(List.of("a","e"),TopWords.top3("e a a"));
        assertEquals(List.of("a", "of", "on"),  TopWords.top3(String.join("\n", "In a village of La Mancha, the name of which I have no desire to call to",
                "mind, there lived not long since one of those gentlemen that keep a lance",
                "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                "coursing. An olla of rather more beef than mutton, a salad on most",
                "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                "on Sundays, made away with three-quarters of his income.")));
        assertEquals(List.of("yz", "a"),TopWords.top3("a yz"));

    }

}