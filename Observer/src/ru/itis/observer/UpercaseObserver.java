package ru.itis.observer;

/**
 * 07.11.2017
 * UpercaseObserver
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UpercaseObserver implements CharacterObserver {
    @Override
    public void handle(char character) {
        if (Character.isUpperCase(character)) {
            System.out.println("АААА БОЛЬШАЯ БУКВА " + character);
        }
    }
}
