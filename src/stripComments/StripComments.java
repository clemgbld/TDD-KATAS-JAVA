package stripComments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {

        String textParsed =text.replaceAll(buildRegex(commentSymbols), "");
        int textParsedLineEscapedNumber = extractLineEscapeNumber(textParsed);
        String textParsedTrimed = Arrays.stream(textParsed
                        .split("\n")).map(String::stripTrailing)
                .collect(Collectors.joining("\n"));
        int textParsedTrimedLineEscapeNumber = extractLineEscapeNumber(textParsedTrimed);
        return textParsedLineEscapedNumber == textParsedTrimedLineEscapeNumber ? textParsedTrimed : textParsedTrimed + "\n".repeat(textParsedLineEscapedNumber - textParsedTrimedLineEscapeNumber);
    }

    private static String buildRegex(String[] commentSymbols) {
        return Arrays.stream(commentSymbols)
                .map(s -> buildEscape(s) + s + "[^\\n]*")
                .collect(Collectors.joining("|"));
    }

    private static String buildEscape(String s){
        return List.of(".","^","$","*","+","?","[","]","|","(",")","\\","{","}").contains(s) ? "\\" : "";
    }

    private static  int extractLineEscapeNumber(String s){
        return Arrays.stream(s.split(""))
                .filter(str -> str.equals("\n"))
                .toList().size();
    }
}
