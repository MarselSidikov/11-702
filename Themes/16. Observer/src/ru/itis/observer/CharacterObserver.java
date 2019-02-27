package ru.itis.observer;

/**
 * 07.11.2017
 * CharacterObserver
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
// интерфейс описывает поведение наблюдателя
// таким образом, классы, которые имплементируют данный интерфейс
// обязаны реализовать метод handle
public interface CharacterObserver {
    void handle(char character);
}
