package main.java.org.example;

public class MultiplyCommand implements Command {

    private Calculator _calculator;
    private int _operand;

    public MultiplyCommand(Calculator calculator, int operand) {
        _calculator = calculator;
        _operand = operand;
    }

    @Override
    public void execute() {
        _calculator.Calculate(main.java.org.example.Operations.Multiply, _operand); // Efectuăm operația de înmulțire
    }

    @Override
    public void undo() {
        _calculator.Calculate(main.java.org.example.Operations.Divide, _operand); // Revenim la operația de împărțire pentru a corecta acțiunea undo
    }

    @Override
    public void redo() {
        execute();
    }
}
