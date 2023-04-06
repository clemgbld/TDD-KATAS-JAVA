package longestRepetition;

import java.util.LinkedHashMap;

import java.util.Map;


public class Solution {

    public static Object[] longestRepetition(String s) {
        if(s == "") return new Object[]{"",0};
        var stringArr = s.toLowerCase().split("(?<=(.))(?!\\1)");

        var i = 0;

        var map = new LinkedHashMap<String,Integer>();

        while(stringArr.length > i){
            map.put(stringArr[i],stringArr[i].length());
            i++;

        }
        var result = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        return  new Object[]{String.valueOf(result.getKey().charAt(0)),result.getValue()};

    }

}

