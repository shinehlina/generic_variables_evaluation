package demo;

@FunctionalInterface
public interface IComputeEngineVariableOperation<T, R> {
    R invoke(Object operand);
}
