package ru.itis;

/**
 * 13.02.2018
 * List
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface List<T> extends Collection<T> {
    T get(int index);
    void addToBegin(T object);
}
