package main.java.org.example;

public interface Command {
    void execute();
    void undo();
    void redo();
}
