package ru.itis.observer;

/**
 * 07.11.2017
 * DigitsObserver
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class DigitsObserver implements CharacterObserver {

    private int count;

    public DigitsObserver() {
        this.count = 0;
    }

    @Override
    public void handle(char character) {
        if (Character.isDigit(character)) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
