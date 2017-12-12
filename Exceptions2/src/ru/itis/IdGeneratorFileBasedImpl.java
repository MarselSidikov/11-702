package ru.itis;

import java.io.*;

/**
 * 12.12.2017
 * IdGeneratorFileBasedImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class IdGeneratorFileBasedImpl implements IdGenerator {

    private int id;
    private String fileName;

    public IdGeneratorFileBasedImpl(String fileName) throws IOException {
        this.fileName = fileName;

        BufferedReader reader = new BufferedReader(
                new FileReader(fileName));

        String lastGeneratedId = reader.readLine();

        id = Integer.parseInt(lastGeneratedId);

    }

    @Override
    public int generate() {
        int currentId = id;
        id++;

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(String.valueOf(id));
            writer.close();
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
        return currentId;
    }
}
