package reflectionSetKata;

public class Main {
    public static void main(String[] args) {
        Logger logger = new JavaLogger();
        PrintDynamicSetImplContent printDynamicSetImplContent = new PrintDynamicSetImplContent(logger);
        printDynamicSetImplContent.execute(args);
    }
}
