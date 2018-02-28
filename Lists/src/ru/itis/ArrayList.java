package ru.itis;

import java.util.Comparator;
import java.util.Iterator;

/**
 * 13.02.2018
 * ArrayList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ArrayList<T> implements List<T> {

    private static final int DEFAULT_SIZE = 10;

    private T elements[];
    private int count;

    public ArrayList() {
        this.elements = (T[]) (new Object[DEFAULT_SIZE]);
        this.count = 0;
    }

    @Override
    public T get(int index) {
        if (index < this.count) {
            return elements[index];
        } else throw new IllegalArgumentException();
    }

    @Override
    public void addToBegin(T object) {

    }

    @Override
    public void add(T element) {
        if (this.count < this.elements.length) {
            this.elements[count++] = element;
        } else throw new IllegalArgumentException();
    }

    @Override
    public void remove(T element) {
        for (int i = 0; i < count; i++) {
            if (element.equals(elements[i])) {
                for (int j = i; j < count - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                count--;
                return;
            }
        }
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    private class ArrayListIterator implements Iterator<T> {
        private int currentIndex;

        ArrayListIterator() {
            this.currentIndex = 0;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            T result = elements[currentIndex];
            currentIndex++;
            return result;
        }
    }

    private void set(int index, T value) {
        this.elements[index] = value;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private static <E> void bubbleSort(ArrayList<E> list, Comparator<E> comparator) {
        for (int i = list.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                int compareResult = 0;
                if (comparator != null) {
                    compareResult = comparator.compare(list.get(j), list.get(j + 1));
                } else {
                    Comparable<E> comparableA = (Comparable<E>) list.get(j);
                    compareResult = comparableA.compareTo(list.get(j+1));
                }

                if (compareResult > 0) {
                    E temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        bubbleSort(list, null);
    }

    public static <E> void sort(ArrayList<E> list, Comparator<E> comparator) {
        bubbleSort(list, comparator);
    }
}
