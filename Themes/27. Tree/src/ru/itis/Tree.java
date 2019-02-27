package ru.itis;

/**
 * 03.04.2018
 * Tree
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface Tree<T extends Comparable<T>> {
    void insert(T value);
    boolean remove(T value);
    void print();
    boolean contains(T value);
    void printByLevels();
    boolean isBst();
}
