package sorter;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 20.02.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        Scanner scanner4 = new Scanner(System.in);

        Integer a[] = {5, 3, 1, 5, -2, 3, 1};
        Sorter.sort(a);

        Scanner[] scanners = {scanner, scanner2, scanner3, scanner4};

        // Sorter.sort(scanners);
        System.out.println(Arrays.toString(a));
    }
}
