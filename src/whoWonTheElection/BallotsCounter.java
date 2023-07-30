package whoWonTheElection;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BallotsCounter {
    public static String getWinner(final List<Object> listOfBallots) {
        Map<String, Long> frequencyMap = listOfBallots.stream()
                .collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

        Optional<Map.Entry<String, Long>> maxEntry = frequencyMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

       return maxEntry.map(e -> e.getValue() > (long) listOfBallots.size() / 2L ? e.getKey() : null)
               .orElse(null);
    }
}
