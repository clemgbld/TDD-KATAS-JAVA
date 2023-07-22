package morseCodeDecoderAdvanced;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    private static final Map<String, String> MorseCode = new HashMap<>();

    static {
        MorseCode.put(".-", "A");
        MorseCode.put("-...", "B");
        MorseCode.put("-.-.", "C");
        MorseCode.put("-..", "D");
        MorseCode.put(".", "E");
        MorseCode.put("..-.", "F");
        MorseCode.put("--.", "G");
        MorseCode.put("....", "H");
        MorseCode.put("..", "I");
        MorseCode.put(".---", "J");
        MorseCode.put("-.-", "K");
        MorseCode.put(".-..", "L");
        MorseCode.put("--", "M");
        MorseCode.put("-.", "N");
        MorseCode.put("---", "O");
        MorseCode.put(".--.", "P");
        MorseCode.put("--.-", "Q");
        MorseCode.put(".-.", "R");
        MorseCode.put("...", "S");
        MorseCode.put("-", "T");
        MorseCode.put("..-", "U");
        MorseCode.put("...-", "V");
        MorseCode.put(".--", "W");
        MorseCode.put("-..-", "X");
        MorseCode.put("-.--", "Y");
        MorseCode.put("--..", "Z");
        MorseCode.put("-----", "0");
        MorseCode.put(".----", "1");
        MorseCode.put("..---", "2");
        MorseCode.put("...--", "3");
        MorseCode.put("....-", "4");
        MorseCode.put(".....", "5");
        MorseCode.put("-....", "6");
        MorseCode.put("--...", "7");
        MorseCode.put("---..", "8");
        MorseCode.put("----.", "9");
        MorseCode.put(".-.-.-", ".");
        MorseCode.put("--..--", ",");
        MorseCode.put("---...", ":");
        MorseCode.put("..--..", "?");
        MorseCode.put("-.-.--", "!");
        MorseCode.put("-....-", "-");
        MorseCode.put(".-..-.", "\"");
    }

    public static String decodeMorse(String morse) {
        return Arrays.stream(morse.trim().split("   "))
                .map(MorseCodeDecoder::translateWord)
                .collect(Collectors.joining(" "));
    }

    public static String decodeBits(String bits) {
        String bitsWithRemovedTrailingZeros = bits.replaceAll("^0+|0+$", "");
        int timeUnit = calcTimeUnit(bitsWithRemovedTrailingZeros);
        Map<String, String> bitsToMorse = Map.of("1".repeat(timeUnit), ".", "111".repeat(timeUnit), "-");

        return Arrays.stream(bitsWithRemovedTrailingZeros.trim().split("0".repeat(timeUnit)))
                .map(bitsToMorse::get)
                .collect(Collectors.joining())
                .replaceAll("nullnull"," ");
    }

    private static String translateWord(String morse) {
        return Arrays.stream(morse.split(" "))
                .map(MorseCode::get)
                .collect(Collectors.joining());

    }


    private static int calcTimeUnit(String bits) {
        return Arrays.stream(bits.split("(?<=(.))(?!\\1)"))
                .mapToInt(String::length)
                .min()
                .orElse(0);
    }
}
