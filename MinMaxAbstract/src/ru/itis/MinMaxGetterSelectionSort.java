package ru.itis;

/**
 * 31.10.2017
 * MinMaxGetterSelectionSort
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MinMaxGetterSelectionSort extends AbstractMinMaxGetter {

    public MinMaxGetterSelectionSort(int elements[]) {
        super(elements);
    }

    @Override
    protected void sort() {
        for (int i =0; i < elements.length; i++) {
            int min = elements[i];
            int minIndex = i;
            for (int j = i; j < elements.length; j++) {
                if (min > elements[j]) {
                    min = elements[j];
                    minIndex = j;
                }
            }
            int temp = elements[minIndex];
            elements[minIndex] = elements[i];
            elements[i] = temp;
        }
    }
}
