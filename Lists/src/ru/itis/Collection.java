package ru.itis;

/**
 * 13.02.2018
 * Collection
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface Collection<E> extends Iterable<E> {
    void add(E element);
    void remove(E element);
    boolean contains(E element);
    int size();
}
