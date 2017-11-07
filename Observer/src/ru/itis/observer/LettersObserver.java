package ru.itis.observer;

/**
 * 07.11.2017
 * LettersObserver
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class LettersObserver implements CharacterObserver {
    private int count;

    public LettersObserver() {
        this.count = 0;
    }

    @Override
    public void handle(char character) {
        if (Character.isLetter(character)) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
