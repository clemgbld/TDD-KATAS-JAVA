package reflectionSetKata;


import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Set;

public class PrintDynamicSetImplContent {
    private final Logger logger;

    public PrintDynamicSetImplContent(Logger logger) {
        this.logger = logger;
    }


    public void execute(String[] args) {
        Class<? extends Set<String>> cl;
        try {
            cl = (Class<? extends Set<String>>) Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            logger.log("This class does not exist");
            return;
        }

        Constructor<? extends Set<String>> cons;

        try {
            cons = cl.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            logger.log("This class has no parameterless constructor");
            return;
        }

        try {
            Set<String> set = cons.newInstance();
            set.addAll(Arrays.asList(args).subList(1, args.length));
            logger.log(set);

        } catch (Exception e) {
            logger.log("This class does not implement Set");
        }

    }


}
