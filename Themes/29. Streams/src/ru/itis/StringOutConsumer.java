package ru.itis;

import java.util.function.Consumer;

/**
 * 24.04.2018
 * StringOutConsumer
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class StringOutConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer s) {
        System.out.println("Hello, " + s);
    }
}
