package reflectionSetKata;

public class SystemLogger implements Logger{

    @Override
    public void log(Object anyObject) {
        System.out.println(anyObject);
    }
}
