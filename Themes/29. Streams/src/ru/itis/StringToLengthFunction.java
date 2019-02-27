package ru.itis;

import java.util.function.Function;

/**
 * 24.04.2018
 * StringToLengthFunction
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class StringToLengthFunction implements Function<String, Integer> {
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}
