package scramblies;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return false;
        }

        int[] str1Count = new int[26];
        int[] str2Count = new int[26];

        for (char ch : str1.toCharArray()) {
            str1Count[ch - 'a']++;
        }

        for (char ch : str2.toCharArray()) {
            str2Count[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (str2Count[i] > str1Count[i]) {
                return false;
            }
        }

        return true;
    }

}
