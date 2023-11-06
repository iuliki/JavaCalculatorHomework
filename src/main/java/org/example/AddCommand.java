package main.java.org.example;

public class AddCommand implements main.java.org.example.Command {

    private main.java.org.example.Calculator _calculator;
    private int _operand;

    public AddCommand(main.java.org.example.Calculator calculator, int operand)
    {
        _calculator = calculator;
        _operand = operand;
    }


    @Override
    public void execute() {
        _calculator.Calculate(main.java.org.example.Operations.Add, _operand);
    }

    @Override
    public void undo() {
        _calculator.Calculate(main.java.org.example.Operations.Substract, _operand);
    }

    @Override
    public void redo() {
        execute();
    }
}
