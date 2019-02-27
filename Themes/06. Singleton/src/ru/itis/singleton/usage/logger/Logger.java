package ru.itis.singleton.usage.logger;

import java.time.LocalDateTime;

/**
 * 10.10.2017
 * Logger
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Logger {
    private static final Logger instance;

    private Logger() {

    }

    private final String PREFIX = "ITIS, 11-702 Logger: ";

    public void log(String className, String message) {
        System.out.println(PREFIX + className + " " + message +
                " at " + LocalDateTime.now());
    }

    static {
        instance = new Logger();
    }

    public static Logger getLogger() {
        return instance;
    }
}
