package reflectionSetKata;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("./src/reflectionSetKata/config.text"))) {
            String loggerImplClassName = scanner.next();
            Logger logger = (Logger) Class.forName(loggerImplClassName)
                    .getDeclaredConstructor()
                    .newInstance();
            PrintDynamicSetImplContent printDynamicSetImplContent = new PrintDynamicSetImplContent(logger);
            printDynamicSetImplContent.execute(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
