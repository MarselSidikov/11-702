package ru.itis;

/**
 * 13.02.2018
 * ArrayList
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ArrayList implements List {

    private static final int DEFAULT_SIZE = 10;

    private Object elements[];
    private int count;

    public ArrayList() {
        this.elements = new Object[DEFAULT_SIZE];
        this.count = 0;
    }

    @Override
    public Object get(int index) {
        if (index < this.count) {
            return elements[index];
        } else throw new IllegalArgumentException();
    }

    @Override
    public void addToBegin(Object object) {

    }

    @Override
    public void add(Object element) {
        if (this.count < this.elements.length) {
            this.elements[count++] = element;
        } else throw new IllegalArgumentException();
    }

    @Override
    public void remove(Object element) {
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
    public boolean contains(Object element) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }
}
