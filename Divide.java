package JAVA.OOP.OOP61.попытки.OOP6;

public class Divide implements Operation {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Делить на 0 нельзя");
        }
    }
}