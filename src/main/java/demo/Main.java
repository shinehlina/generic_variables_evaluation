package demo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ValuatedComputeEngineVariable var = new ComputeEngineVariable("var", ComputeEngineVariableType.LIST, Arrays.asList(1, 2, 3));
        System.out.println(var.invokeOperation(ComputeEngineVariableOperations.SIZE));
    }
}
