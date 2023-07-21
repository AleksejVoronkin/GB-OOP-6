package JAVA.OOP.OOP61.попытки.OOP6;



public class CalculatorPresenter {
    private final CalculatorModel model;
    private final CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void performOperation() {
        double num1 = view.getNumberInput();
        Operation operation = view.getOperationInput();
        double num2 = view.getNumberInput();

        try {
            model.performOperation(num1, num2, operation);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return;
        }

        view.displayResult(model.getResult());
    }
}