package reflectionSetKata;
import java.util.Arrays;
import java.util.Set;

public class PrintDynamicSetImplContent {
    private final Logger logger;

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
        } catch (ClassNotFoundException e) {
            logger.log("This class does not exist");
        }catch (NoSuchMethodException e) {
            logger.log("This class has no parameterless constructor");
        }catch (ArrayIndexOutOfBoundsException e){
            logger.log("No implementation of Set chosen");
        }
        catch (Exception e) {
            logger.log("This class does not implement Set");
        }

    }


}
