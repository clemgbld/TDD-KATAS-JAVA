package reflectionSetKata.tests;

import reflectionSetKata.Logger;

public class InMemoryLogger implements Logger {
    private final Spy spy;

    public InMemoryLogger(Spy spy) {
        this.spy = spy;
    }


    @Override
    public void log(Object anyObject) {
        spy.call(anyObject);
    }
}
