package mergedStringChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMergerTest {

    @Test
    void shouldCheckThatAMergedStringCanBeConstructAnotherString(){
    assertFalse(StringMerger.isMerge("c","s",""));
     assertTrue(StringMerger.isMerge("c","c",""));
     assertTrue(StringMerger.isMerge("c","","c"));
     assertTrue(StringMerger.isMerge("co","c","o"));
     assertFalse(StringMerger.isMerge("codewars", "cod", "wars"));
     assertTrue(StringMerger.isMerge("codewars", "cdwr", "oeas"));
     assertFalse(StringMerger.isMerge("codewars","code","warss"));
     assertTrue(StringMerger.isMerge("Bananas from Bahamas","Bahas","Bananas from ma"));
     assertTrue(StringMerger.isMerge("Bananas from Bahamas","Bahas","Bananas from am"));
    }



}