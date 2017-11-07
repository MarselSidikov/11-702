package ru.itis.observer;

/**
 * 07.11.2017
 * CharacterObservable
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface CharacterObservable {
    // добавить наблюдателя
    void addObserver(CharacterObserver characterObserver);
    // оповестить всех
    void notifyAll(char character);
}
