package reflectionSetKata;

public class JavaLogger implements Logger{
    public JavaLogger() {
    }

    @Override
    public void log(Object anyObject) {
        System.out.println(anyObject);
    }
}
