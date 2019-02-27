package ru.itis;

public class SorterMergeImpl {

    // вспомогательный массив
    private int helpArray[];

    // сортировка
    public void sort(int[] array) {
        // инициализируем вспомогательный массив
        initHelpArray(array.length);
        // сортируем полученный массив
        sort(array, 0, array.length - 1);
    }

    private void initHelpArray(int maxSize) {
        this.helpArray = new int[maxSize];
    }

    // процедура сортировки принимает левую границу и правую границу
    private void sort(int array[], int lower, int higher) {
        LogUtils.log(array, "sort", lower, higher);

        // если левая граница уперлась в правую - останавливаем
        if (higher <= lower) {
            return;
        }

        // вычисляем индекс среднего
        int middle = lower + (higher - lower) / 2;

        LogUtils.indentUp();
        // сортируем левую половину
        sort(array, lower, middle);
        // сортируем правую половину
        sort(array, middle + 1, higher);
        // сливаем
        merge(array, lower, middle, higher);

        LogUtils.indentDown();


    }

    // сливает две половинки массива array[]
    // левая половинка array[lower..middle]
    // права половинка array[middle+1..higher]
    private void merge(int array[],
                       int lower,
                       int middle,
                       int higher) {

        // в вспомогательный массив копируем интересующие нас значения
        for (int currentIndex = lower; currentIndex <= higher; currentIndex++) {
            helpArray[currentIndex] = array[currentIndex];
        }

        // System.arraycopy(array, lower, helpArray, lower, higher - lower);

        int i = lower, j = middle + 1;
        for (int currentIndex = lower; currentIndex <= higher; currentIndex++) {
            if (i > middle) {
                array[currentIndex] = helpArray[j];
                j++;
            } else if (j > higher) {
                array[currentIndex] = helpArray[i];
                i++;
            } else if (helpArray[j] < helpArray[i]) {
                array[currentIndex] = helpArray[j];
                j++;
            } else {
                array[currentIndex] = helpArray[i];
                i++;
            }
        }

        LogUtils.log(array, "merge", lower, higher);
    }
}