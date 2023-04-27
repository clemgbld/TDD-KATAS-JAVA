package writeNumberInExpandedForm;

import java.util.ArrayList;
import java.util.List;


public class Kata {
    public static String expandedForm(int num) {

        if(num == 0) return "0";


        int i = 0;
        List<String> numStr = new ArrayList<>();


        while (String.valueOf(num).length() > i){
            if(i == num - 1){
                numStr.add(String.valueOf(num).substring(i));
            }else {
                char firstDigitChar = String.valueOf(num).substring(i).charAt(0);
                if(firstDigitChar != '0'){
                    numStr.add(firstDigitChar + "0".repeat(String.valueOf(num).length() - 1 - i));
                }

            }
            i++;

        }



        return String.join(" + ", numStr);

    }
}
