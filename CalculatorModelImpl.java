package JAVA.OOP.OOP61.попытки.OOP6;

public class CalculatorModelImpl implements CalculatorModel {
    private double result;

    @Override
    public void performOperation(double num1, double num2, Operation operation) {
        result = operation.calculate(num1, num2);
    }
 

    @Override
    public double getResult() {
        return result;
    }
}
