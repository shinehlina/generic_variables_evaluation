package demo;

import java.util.function.Function;

public final class VariableOperationImplementation<T, R> implements IComputeEngineVariableOperation<T, R> {
    private Function<T, R> function;

    VariableOperationImplementation(Function<T, R> function) {
        this.function = function;
    }

    public R invoke(Object operand) {
        return function.apply((T)operand);
    }
}


