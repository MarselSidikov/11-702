package ru.itis.singleton.usage.logger;

/**
 * 10.10.2017
 * Calculator
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Calculator {

    private final Logger logger = Logger.getLogger();

    public int sum(int a, int b) {
        logger.log(this.getClass().getName(),
                "was called sum-method");
        return a + b;
    }

    public int mult(int a, int b) {
        logger.log(this.getClass().getName(),
                "was called mult-method");
        return a * b;
    }

    public int div(int a, int b) {
        logger.log(this.getClass().getName(),
                "was called div-method");
        return a / b;
    }
}
