package ru.itis;

import java.io.FileInputStream;

/**
 * 14.11.2017
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream input = new FileInputStream("input.txt");
        byte bytes[] = new byte[100];
        int length = input.read(bytes);

        for (byte current : bytes) {
            System.out.print((char)current);
        }
    }
}
