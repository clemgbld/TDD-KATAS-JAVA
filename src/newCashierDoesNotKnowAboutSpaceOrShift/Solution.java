package newCashierDoesNotKnowAboutSpaceOrShift;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution {

    private static final Map<String,Integer> ITEM_ORDER_MAPPING = Map.of("Burger",1,"Fries",2,"Chicken",3,"Pizza",4,"Sandwich",5,"Onionrings",6,"Milkshake",7,"Coke",8);

    public static String getOrder(String order) {
        return separateOrderWords(order).stream()
                .map(Solution::capitalize)
                .sorted(Comparator.comparing(ITEM_ORDER_MAPPING::get))
                .collect(Collectors.joining(" "));
    }

    private static List<String> separateOrderWords(String order) {
        List<String> cleanOrder = new ArrayList<>();
        Pattern pattern = Pattern.compile("chicken|fries|burger|pizza|sandwich|onionrings|milkshake|coke",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(order);
        while (matcher.find()){
            cleanOrder.add(matcher.group());
        }
        return cleanOrder;
    }

    private static String capitalize(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
