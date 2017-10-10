package ru.itis.singleton.usage.logger;

import java.util.Scanner;

/**
 * 10.10.2017
 * CommandsReader
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class CommandsReader {

    private final Logger logger = Logger.getLogger();

    private Scanner scanner;

    public CommandsReader() {
        scanner = new Scanner(System.in);
    }

    public String readCommand() {
        String command =  scanner.next();
        logger.log(this.getClass().getName(), "was read command <" + command + "> ");
        return command;
    }
}
