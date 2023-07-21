package JAVA.OOP.OOP61.попытки.OOP6;

import java.util.Scanner;

public class CalculatorView {
    private final Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    public double getNumberInput() {
        System.out.print("Введите число: ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Введите корректное число: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    public Operation getOperationInput() {
        System.out.print("Введите операцию из этого списка -> +, -, *, /: ");
        char operation = scanner.next().charAt(0);
        switch (operation) {
            case '+':
                return new Addition();
            case '-':
                return new Subtraction();
            case '*':
                return new Multiplication();
            case '/':
                return new Divide();
        }
        throw new IllegalArgumentException("НЕВЕРНАЯ ОПЕРАЦИЯ. ПОПРОБУЙТЕ СНОВА");
    }
}
