package ru.itis;

import java.io.InputStream;

public class MainSystemIn {

    public static void main(String[] args)                                             throws Exception {
        InputStream input = System.in;

        byte bytes[] = new byte[100];

        int length = input.read(bytes);

        for (int i = 0; i < length; i++) {
            System.out.print((char)bytes[i]);
        }
    }
}
