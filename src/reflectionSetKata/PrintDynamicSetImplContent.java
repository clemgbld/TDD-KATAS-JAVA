package reflectionSetKata;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class PrintDynamicSetImplContent {
    private final Logger logger;

    private final Map<Class<? extends Exception>,String> mapErrorToMessage = Map.of(
            ClassNotFoundException.class,"This class does not exist",
            NoSuchMethodException.class,"This class has no parameterless constructor",
            ArrayIndexOutOfBoundsException.class,"No implementation of Set chosen"
            );

    public PrintDynamicSetImplContent(Logger logger) {
        this.logger = logger;
    }

    public void execute(String[] args) {
        try {
            @SuppressWarnings("unchecked") Set<String> set = (Set<String>) Class
                    .forName(args[0])
                    .getDeclaredConstructor()
                    .newInstance();
            set.addAll(Arrays.asList(args).subList(1, args.length));
            logger.log(set);
        }
        catch (Exception e) {
            logger.log(mapErrorToMessage.getOrDefault(e.getClass(),"This class does not implement Set"));
        }

    }


}
