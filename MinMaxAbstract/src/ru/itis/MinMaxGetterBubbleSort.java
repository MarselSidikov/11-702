package ru.itis;

/**
 * 31.10.2017
 * MinMaxGetterBubbleSort
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MinMaxGetterBubbleSort extends AbstractMinMaxGetter {

    public MinMaxGetterBubbleSort(int elements[]) {
        super(elements);
    }

    @Override
    protected void sort() {
        for (int i = elements.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (elements[j] > elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }
}
