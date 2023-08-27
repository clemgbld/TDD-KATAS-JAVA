package theOffice;

import java.util.ArrayList;

import java.util.List;

public class TheOffice {
    public static Object meeting(Room[] rooms, int need) {
       return need == 0 ?  "Game On" : meetingsRecur(rooms,0,need,new ArrayList<>());
    }

    private static Object meetingsRecur(Room[] rooms,int i , int need,List<Integer> result){
        if(need == 0) return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        if(i  > rooms.length - 1) return "Not enough!";
        int takenChairs = takeChairs(calcAvailableChairs(rooms[i]),need);
        result.add(takenChairs);
        return meetingsRecur(rooms,i +1, need - takenChairs,result);

    }

    private static int calcAvailableChairs(Room rooms) {
        return rooms.chairs() - rooms.occupants().length();
    }

    private static int takeChairs(int chairs, int need){
       return chairs <= need ? Math.max(chairs,0) : Math.max(need, 0);
    }
}
