package reflectionSetKata.tests;

import java.util.ArrayList;
import java.util.List;

public class Spy {

    private List<Object> params = new ArrayList<>();

    public  Object firstCall() {
        return params.get(0);
    }

    public void call(Object anyObject) {
        params.add(anyObject);
    }
}
