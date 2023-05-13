package rangeExtraction;

import java.util.ArrayList;
import java.util.List;


public class Solution {
    public static String rangeExtraction(int[] ints) {

        List<String> result = new ArrayList<>();
        Integer startRange = null;
        Integer endRange = null;

        for (int anInt : ints) {
            if (startRange == null) {
                startRange = anInt;
            } else if (endRange == null && startRange + 1 != anInt) {
                result.add(Integer.toString(startRange));
                startRange = anInt;
            } else if (endRange == null) {
                endRange = anInt;
            } else if (endRange + 1 == anInt) {
                endRange = anInt;
            } else {
                if (startRange + 1 == endRange) {
                    result.add(Integer.toString(startRange));
                    result.add(Integer.toString(endRange));
                } else {
                    result.add(startRange + "-" + endRange);
                }

                endRange = null;
                startRange = anInt;
            }

        }

        if(endRange != null && startRange + 1 != endRange){
                result.add(startRange + "-" + endRange);
        }else{
                if(startRange != null){
                    result.add(Integer.toString(startRange));
                }

               if(endRange != null){
                   result.add(Integer.toString(endRange));
               }

        }

        return String.join(",", result);
    }
}
