package main.java.org.example;

public class DivideCommand implements Command {

    private Calculator _calculator;
    private int _operand;

    public DivideCommand(Calculator calculator, int operand) {
        _calculator = calculator;
        _operand = operand;
    }

    @Override
    public void execute() {
        _calculator.Calculate(main.java.org.example.Operations.Divide, _operand); // Efectuăm operația de împărțire
    }

    @Override
    public void undo() {
        _calculator.Calculate(main.java.org.example.Operations.Multiply, _operand); // Revenim la operația de înmulțire pentru a corecta acțiunea undo
    }

    @Override
    public void redo() {
        execute();
    }
}
