package main.java.org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // currently Main is the Invoker

        Calculator calculator = new Calculator();// this is the Receiver
        AddCommand addCommand = new AddCommand(calculator, 30);// this is the Command
        addCommand.execute();
        main.java.org.example.SubstractCommand substractCommand = new main.java.org.example.SubstractCommand(calculator, 12);// this is the Command
        substractCommand.execute();
        DivideCommand divideCommand = new DivideCommand(calculator, 2);
        divideCommand.execute();
        main.java.org.example.MultiplyCommand multiplyCommand = new main.java.org.example.MultiplyCommand(calculator, 3);
        multiplyCommand.execute();
        multiplyCommand.undo();
        divideCommand.undo();
        substractCommand.undo();
        addCommand.redo();



        // 1+1=2
        // 2*3 = 6
        // 6-2 = 4
        // undo
        // 4+2 = 6
        // undo
        // 6/3 = 2

        // implement all other 3 methods
        // implement a command historacly stack, where you can undo last executed commands until there is none left
        System.out.println("Aici este stack hystoracl - aici nu am inteles exact...m-am uitat pe internet");
        Stack<Command> commandHistory = new Stack<>();
        commandHistory.push(addCommand);
        commandHistory.push(substractCommand);
        commandHistory.push(divideCommand);
        commandHistory.push(multiplyCommand);

        while (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.pop();
            lastCommand.undo();
        }

        // at the same time you can also redo commands
        // this should work exactly like in a text editor, where you can Undo and Redo sequentially until the beginning or end

    }
}