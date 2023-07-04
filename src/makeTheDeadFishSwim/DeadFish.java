package makeTheDeadFishSwim;

import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    public static int[] parse(String s) {
        return parseRecur(s,0,List.of()).stream().mapToInt(Integer::intValue).toArray();
    }

    private static List<Integer> parseRecur(String s,int val, List<Integer> result){
       if(s.length() == 0) return result;
       if(s.charAt(0) == 'i') return parseRecur(s.substring(1), val + 1 , result);
       if(s.charAt(0) == 'd') return parseRecur(s.substring(1), val - 1 , result);
       if(s.charAt(0) == 's') return parseRecur(s.substring(1), val * val , result);
       List<Integer> newResult = new ArrayList<>(result);
       newResult.add(val);
       return parseRecur(s.substring(1), val , newResult);
    }
}
