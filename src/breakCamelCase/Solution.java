package breakCamelCase;

public class Solution {
    public static String camelCase(String s) {
      return  String.join(" ", s.split("(?=[A-Z])"));
    }
}
