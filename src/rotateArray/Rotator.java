package rotateArray;


import java.util.Arrays;
import java.util.Collections;


public class Rotator {
    public Object[] rotate(Object[] data, int n) {
        Object[] dataToRotate = Arrays.copyOf(data,data.length);
        Collections.rotate(Arrays.asList(dataToRotate),n);
        return dataToRotate;
    }
}
