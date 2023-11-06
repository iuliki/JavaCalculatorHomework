package main.java.org.example;

public class Calculator {
    private int _total = 0;

    public void Calculate(main.java.org.example.Operations operation, int operand) {
        switch (operation) {
            case Add -> {
                int newTotal = _total + operand;
                System.out.println(_total + " + " + operand + " = " + newTotal);
                _total = newTotal;
            }
            case Substract -> {
                int newTotal = _total - operand;
                System.out.println(_total + " - " + operand + " = " + newTotal);
                _total = newTotal;
            }
            case Multiply -> {
                int newTotal = _total * operand;
                System.out.println(_total + " * " + operand + " = " + newTotal);
                _total = newTotal;
            }
            case Divide -> {
                if (operand != 0) {
                    int newTotal = _total / operand;
                    System.out.println(_total + " / " + operand + " = " + newTotal);
                    _total = newTotal;
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
            }
        }
    }

    public int getTotal() {
        return _total;
    }
}
