package ru.itis;

public class Main {

    public static void main(String[] args) {
        int array[] = {3, 2, 4, 5, 3, 2, 4, 56, 432, 1, 1, 1, 1, 1, 2344, 5, 35, 6};
        AbstractMinMaxGetter minMaxGetter = new MinMaxGetterSelectionSort(array);
        System.out.println(minMaxGetter.getMax());
        System.out.println(minMaxGetter.getMin());
    }
}
