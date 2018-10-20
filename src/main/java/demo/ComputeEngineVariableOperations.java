package demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static demo.ComputeEngineVariableType.BOOLEAN;
import static demo.ComputeEngineVariableType.LIST;

public enum ComputeEngineVariableOperations {
    TO_STRING(
            new HashMap<ComputeEngineVariableType, IComputeEngineVariableOperation<?, String>>() {{
                put(BOOLEAN, Objects::toString);
                put(LIST, new VariableOperationImplementation<List<?>, String>(
                        (l) -> l.stream().map(Objects::toString).collect(Collectors.joining(","))));
            }}
    ),
    SIZE(
            new HashMap<ComputeEngineVariableType, IComputeEngineVariableOperation<?, String>>() {{
                put(LIST, new VariableOperationImplementation<List<?>, String>((l) -> String.valueOf(l.size())));
            }});

    Map<ComputeEngineVariableType, IComputeEngineVariableOperation<?, String>> typeOperationMap = new HashMap<>();

    ComputeEngineVariableOperations(Map<ComputeEngineVariableType, IComputeEngineVariableOperation<?, String>> typeOperationMap) {
        this.typeOperationMap.putAll(typeOperationMap);
    }

    IComputeEngineVariableOperation<?, String> getOperationByType(ComputeEngineVariableType type) {
        return typeOperationMap.get(type);
    }
}
