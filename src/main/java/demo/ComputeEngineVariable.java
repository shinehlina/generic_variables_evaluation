package demo;

public class ComputeEngineVariable implements ValuatedComputeEngineVariable{
    private String name;
    private ComputeEngineVariableType type;
    private Object value;

    ComputeEngineVariable(String name, ComputeEngineVariableType type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    @Override
    public String invokeOperation(ComputeEngineVariableOperations operation) {
        return operation.getOperationByType(type).invoke(value);
    }
}
