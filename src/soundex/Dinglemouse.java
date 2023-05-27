package soundex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Dinglemouse {

    public static final int MAX_NUMBER_OF_ZEROES = 3;

    public static String soundex(String str) {
        Map<Character, String> soundexMap = buildSoundexMap();
        return Arrays.stream(str.split(" "))
                .map(s ->applySoundex(s, soundexMap))
                .collect(Collectors.joining(" "));
    }

    private static String applySoundex(String str, Map<Character, String> soundexMap) {
        if (str.length() == 0) return "";
        StringBuilder result = new StringBuilder();
        int i = 0;

        String filteredStr = IntStream.range(0,str.length())
                .mapToObj(n -> isNotHOrW(str,n) ?  Character.toString(str.charAt(n)) : "")
                .collect(Collectors.joining());

        while (filteredStr.length() > i) {
            result.append(convertToDigitOrCapitalize(filteredStr, soundexMap, result, i));
            i++;
        }


        String resultWithAllDigits = result + appendZeroes(result.toString());
        return resultWithAllDigits.substring(0,4);
    }

    private static boolean isNotHOrW(String str,int i) {
        if(i == 0) return true;
        return !Character.toString(str.charAt(i)).equalsIgnoreCase("w") && !Character.toString(str.charAt(i)).equalsIgnoreCase("h");
    }

    private static String convertToDigitOrCapitalize(String str, Map<Character, String> soundexMap, StringBuilder result, int i) {
        if(i == 0){
           return Character.toString(Character.toUpperCase(str.charAt(i)));
        }

        String lastDigit = soundexMap.getOrDefault(Character.toLowerCase(str.charAt(i - 1)),"");

        String digit = soundexMap.getOrDefault(Character.toLowerCase(str.charAt(i)),"");

        return digit.equals(lastDigit) ? "" : digit;

    }


    private static String appendZeroes (String word){
        return "0".repeat(Math.max(MAX_NUMBER_OF_ZEROES - (word.length() - 1),0));
    }


    private static Map<Character, String> buildSoundexMap(){
        Map<Character, String> soundexMap = new HashMap<>();
        soundexMap.put('b',"1");
        soundexMap.put('f',"1");
        soundexMap.put('p',"1");
        soundexMap.put('v',"1");
        soundexMap.put('c',"2");
        soundexMap.put('g',"2");
        soundexMap.put('j',"2");
        soundexMap.put('k',"2");
        soundexMap.put('q',"2");
        soundexMap.put('s',"2");
        soundexMap.put('x',"2");
        soundexMap.put('z',"2");
        soundexMap.put('d',"3");
        soundexMap.put('t',"3");
        soundexMap.put('l',"4");
        soundexMap.put('m',"5");
        soundexMap.put('n',"5");
        soundexMap.put('r',"6");
        return soundexMap;
    }
}
