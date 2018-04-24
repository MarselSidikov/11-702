package ru.itis;

import java.util.function.Predicate;

/**
 * 24.04.2018
 * StringStartWithLetterPredicate
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class StringStartWithLetterPredicate implements Predicate<String> {
    @Override
    public boolean test(String s) {
        return Character.isLetter(s.charAt(0));
    }
}
