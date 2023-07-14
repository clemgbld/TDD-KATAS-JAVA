package reflectionSetKata.tests;

import org.junit.jupiter.api.Test;
import reflectionSetKata.Logger;
import reflectionSetKata.PrintDynamicSetImplContent;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;


import static org.junit.jupiter.api.Assertions.*;

class PrintDynamicSetImplContentTest {
    @Test
    void shouldLogThatTheGivenClassNameDoesNotExists(){
        var spy = new Spy();
        PrintDynamicSetImplContent printDynamicSetImplContent = buildUseCase(spy);
        printDynamicSetImplContent.execute(new String[]{"fqskjm"});
        assertEquals("This class does not exist",spy.firstCall());
    }

    @Test
    void shouldLogThatTheGivenClassHasNoParameterlessConstructor(){
        var spy = new Spy();
        PrintDynamicSetImplContent printDynamicSetImplContent = buildUseCase(spy);
        printDynamicSetImplContent.execute(new String[]{"reflexionSetKata.Logger"});
        assertEquals("This class has no parameterless constructor",spy.firstCall());
    }

    @Test
    void shouldLogThatTheClassDoesNotImplementSet(){
        var spy = new Spy();
        PrintDynamicSetImplContent printDynamicSetImplContent = buildUseCase(spy);
        printDynamicSetImplContent.execute(new String[]{"java.util.ArrayList"});
        assertEquals("This class does not implement Set",spy.firstCall());
    }

    @Test
    void shouldLogAnEmptySet(){
        var spy = new Spy();
        PrintDynamicSetImplContent printDynamicSetImplContent = buildUseCase(spy);
        printDynamicSetImplContent.execute(new String[]{"java.util.HashSet"});
        assertEquals(new HashSet<String>(),spy.firstCall());
    }
    @Test
    void shouldLogASetWithItsContentSorted(){
        var spy = new Spy();
        PrintDynamicSetImplContent printDynamicSetImplContent = buildUseCase(spy);
        printDynamicSetImplContent.execute(new String[]{"java.util.TreeSet","c","b","a"});
        assertEquals(new TreeSet<>(List.of("c", "b", "a")),spy.firstCall());
    }


    private static PrintDynamicSetImplContent buildUseCase(Spy spy) {
        Logger logger = new InMemoryLogger(spy);
        return   new PrintDynamicSetImplContent(logger);
    }


}