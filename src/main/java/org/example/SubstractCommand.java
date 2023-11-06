package main.java.org.example;

public class SubstractCommand implements Command {

    private Calculator _calculator;
    private int _operand;

    public SubstractCommand(Calculator calculator, int operand) {
        _calculator = calculator;
        _operand = operand;
    }

    @Override
    public void execute() {
        _calculator.Calculate(Operations.Substract, _operand); // Modificăm operația aici pentru scădere
    }

    @Override
    public void undo() {
        _calculator.Calculate(Operations.Add, _operand); // Modificăm operația pentru a reveni la adunare
    }

    @Override
    public void redo() {
        execute();
    }
}
