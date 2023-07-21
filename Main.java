package JAVA.OOP.OOP61.попытки.OOP6;


public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModelImpl();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);
        presenter.performOperation();
    }
}

// SOLID 

// Теперь от изначального кода дз к семинару 5 появились такие отличия (структурировал прям по правилам чтобы было легче сверяться):

// S - Single Responsibility Principle - принцип единственной ответственности. 
// Код разделил на классы с интерфейсами и соответсвенно отдельной ответственностью для них (раньше это все были фунции в классах).
// CalculatorModel интерфейс, который определяет операции, а класс CalculatorModelImpl реализует этот интерфейс.

// O - Open closed Principle - принцип открытости-закрытости:
// Новые логические операции могут быть добавлены без изменения существующего кода.

// L - Liskov substitution Principle - принцип подстановки Барбары Лисков. Должна быть возможность вместо базового (родительского) типа (класса) подставить любой его подтип (класс-наследник),
// при этом работа программы не должна измениться.
// Данный принцип реализовал так, что классы Addition, Subtraction, Multiplication, Divide работают, заменяя родительский интерфейс Operation. (в прошлом дз это были просто функции в классе CalculatorView)

// I -  Interface Segregation Principle - принцип разделения интерфейсов.
// Интерфейс CalculatorModel имеет два метода, которые ясно связаны и необходимы для выполнения его функции.

// D - Dependency Inversion Principle - принцип инверсии зависимостей. Модули верхнего уровня не должны зависеть от модулей нижнего уровня. И те, и другие должны зависеть от абстракции. 
//Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

/// Ввожу зависимости от Addition, Subtraction, Multiplication и Division классов в CalculatorView, но вот не уверен что все же соответсвует принципу, так как запутался в этих зависимостях.




