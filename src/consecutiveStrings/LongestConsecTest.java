package consecutiveStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecTest {
   @Test
    void shouldFindTheLongestConsecutiveString(){
       assertEquals("",LongestConsec.longestConsec(new String[]{},0));
       assertEquals("x",LongestConsec.longestConsec(new String[]{"x"},1));
       assertEquals("xz",LongestConsec.longestConsec(new String[]{"x","z"},2));
       assertEquals("xyz",LongestConsec.longestConsec(new String[]{"x","y","z"},3));
       assertEquals("aee",LongestConsec.longestConsec(new String[]{"x","e","a","ee"},2));
       assertEquals("xeb",LongestConsec.longestConsec(new String[]{"x","eb","a","e"},2));
       assertEquals("abigailtheta",LongestConsec.longestConsec(new String[]{"zone", "form", "libe", "zas","abigail", "theta"},2));
       assertEquals("",LongestConsec.longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas"},-2));
      assertEquals("abigailtheta",LongestConsec.longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"},2));
      assertEquals("",LongestConsec.longestConsec(new String[]{},2));

   }
}