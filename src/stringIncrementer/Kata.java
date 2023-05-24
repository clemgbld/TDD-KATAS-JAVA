package stringIncrementer;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {
    public static String incrementString(String str) {
        String rgx = "\\d+$";
        Pattern pattern = Pattern.compile(rgx);
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str + "1";
        }
        String initialExtractedNumber = matcher.group();
        BigInteger parsed = new BigInteger(initialExtractedNumber);
        BigInteger incremented = parsed.add(BigInteger.ONE);
        String afterParsing = incremented.toString();
        int lengthSubtraction = initialExtractedNumber.length() - afterParsing.length();
        String result = "0".repeat(Math.max(lengthSubtraction, 0)) + afterParsing;

        return matcher.replaceAll("") +  result;
    }
}
