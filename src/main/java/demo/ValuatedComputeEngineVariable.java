package demo;

@FunctionalInterface
public interface ValuatedComputeEngineVariable {
    String invokeOperation(ComputeEngineVariableOperations operation);
}
