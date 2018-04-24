package ru.itis;

import java.util.Arrays;
import java.util.List;

/**
 * 24.04.2018
 * MainBestStreamPractice
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainBestStreamPractice {
    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("Marsel777",
                        "Guzel1",
                        "NikitaVoprosyStrannye",
                        "123Kto-ta",
                        "777Azino");

//        strings.stream()
//                .filter(string -> Character.isLetter(string.charAt(0)))
//                .map(string -> string.length())
//                .forEach(integer -> System.out.println("Hello, " + integer));

        strings.stream()
                .filter(string -> Character.isLetter(string.charAt(0)))
                .map(String::length)
                .forEach(integer -> System.out.println("Hello, " + integer));
    }
}
