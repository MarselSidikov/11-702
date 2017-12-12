package ru.itis;

/**
 * 12.12.2017
 * IdGeneratorInMemoryImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class IdGeneratorInMemoryImpl implements IdGenerator {
    private int id;

    @Override
    public int generate() {
        int currentId = id;
        id++;
        return currentId;
    }
}
