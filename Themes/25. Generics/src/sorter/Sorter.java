package sorter;

/**
 * 20.02.2018
 * Sorter
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Sorter {
    // Метод принимает на вход массив типа T
    // А что это за тип T?
    // Это тип, который наследует Comparable
    // то есть объекты этого типа можно сравнивать
    public static <T extends Comparable<T>> void sort(T a[]) {
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j].compareTo(a[j+1]) > 0)  {
                    T temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
