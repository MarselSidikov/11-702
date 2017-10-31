package ru.itis;

/**
 * 31.10.2017
 * AbstractMinMaxGetter
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public abstract class AbstractMinMaxGetter {
    protected int elements[];
    private boolean isSorted;

    public AbstractMinMaxGetter(int elements[]) {
        this.elements = new int[elements.length];
        System.arraycopy(elements, 0, this.elements, 0, elements.length);
        this.isSorted = false;
    }

    public int getMin() {
        if (!isSorted) {
            sort();
            isSorted = true;
        }
        return elements[0];
    }

    public int getMax() {
        if (!isSorted) {
            sort();
            isSorted = true;
        }
        return elements[elements.length - 1];
    }

    protected abstract void sort();
}
