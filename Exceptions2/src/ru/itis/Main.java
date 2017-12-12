package ru.itis;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        IdGenerator generator = null;
        try {
            generator = new IdGeneratorFileBasedImpl("id.txt");
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
        System.out.println(generator.generate());
    }
}
