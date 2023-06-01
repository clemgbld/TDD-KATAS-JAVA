package countTheSmileyFaces;

import java.util.List;

public class SmileFaces {
    public static int countSmileys(List<String> smileys) {
        return (int) smileys.stream()
                .filter(SmileFaces::matchSmiley)
                .count();
    }

    private static boolean matchSmiley(String s){
        return s.matches("[:;][-~]?[D)]");
    }
}
