package ru.itis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> strings =
                Arrays.asList("Marsel777",
                        "Guzel1",
                        "NikitaVoprosyStrannye",
                        "123Kto-ta",
                        "777Azino");

        Stream<String> stringsStream = strings.stream();

        Stream<String> onlyOnLetters = stringsStream.filter(new StringStartWithLetterPredicate());

        List<String> temp = onlyOnLetters.collect(Collectors.toList());

        System.out.println(temp);

        Stream<Integer> lengthStream = temp.stream().map(new StringToLengthFunction());

        List<Integer> temp2 = lengthStream.collect(Collectors.toList());

        System.out.println(temp2);

        temp2.stream().forEach(new StringOutConsumer());
    }
}
