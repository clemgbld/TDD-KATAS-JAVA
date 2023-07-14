package reflectionSetKata.tests;

import reflectionSetKata.Logger;

import java.util.Objects;

public class InMemoryLogger implements Logger {

    private Spy spy = null;

    public InMemoryLogger(){

    }

    public InMemoryLogger(Spy spy) {
        this.spy = spy;
    }


    @Override
    public void log(Object anyObject) {
        if(Objects.isNull(spy)) return;
        spy.call(anyObject);
    }
}
