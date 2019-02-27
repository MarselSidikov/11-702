package ru.itis.singleton.usage.logger;

/**
 * 10.10.2017
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        CommandsReader reader = new CommandsReader();
        Calculator calculator = new Calculator();
        calculator.sum(4, 5);
        reader.readCommand();
        calculator.div(4, 5);
        reader.readCommand();
        calculator.mult(4, 5);
    }
}
