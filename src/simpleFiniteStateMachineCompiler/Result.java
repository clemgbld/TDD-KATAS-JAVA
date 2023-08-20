package simpleFiniteStateMachineCompiler;

import java.util.Arrays;
import java.util.Objects;

public record Result(String finalState, int output, String... path) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Result result)) return false;
        return output == result.output && finalState.equals(result.finalState) && Arrays.equals(path, result.path);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(finalState, output);
        result = 31 * result + Arrays.hashCode(path);
        return result;
    }
}
