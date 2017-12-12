package ru.itis;

import java.io.*;
import java.util.ArrayList;

/**
 * 14.11.2017
 * MainFileNotFoundException
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainFileNotFoundException {
    public static void main(String[] args) {

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new FileReader("input.txt"));
        } catch (FileNotFoundException e) {
            // e.printStackTrace();
            throw new IllegalArgumentException(e);
        }

        String number = null;
        try {
            number = reader.readLine();
        } catch (IOException e) {
            System.err.println(e);
        }

        int numberAsInt = Integer.parseInt(number);
        numberAsInt = numberAsInt + 1;
        System.out.println(numberAsInt);
    }
}
