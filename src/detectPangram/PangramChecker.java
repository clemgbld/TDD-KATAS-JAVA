package detectPangram;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PangramChecker {

    public static final int ALPHABET_LETTER_NUMBER = 26;

    public boolean check(String sentence) {
        return letterWithoutDuplicateSize(sentence) == ALPHABET_LETTER_NUMBER;
    }

    private int letterWithoutDuplicateSize(String sentence) {
        return Arrays.stream(sentence.toLowerCase().split(""))
                .filter(this::isLetter)
                .collect(Collectors.toSet()).size();
    }

    private boolean isLetter (String str){
        return str.matches("[a-z]");
    }
}
