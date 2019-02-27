package ru.itis;

/**
 * 21.11.2017
 * TextProcessor
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class TextProcessor {
    private static final int MAX_LINES_COUNT = 10;

    private String lines[];
    private int count;

    public TextProcessor() {
        this.lines = new String[MAX_LINES_COUNT];
        this.count = 0;
    }

    public void add(String line) {
        this.lines[count++] = line;
    }

    public void process(LineTransformation transformation) {
        for (int i = 0; i < count; i++) {
            lines[i] = transformation.transform(lines[i]);
        }
    }

    public void printLines() {
        for (int i = 0; i < count; i++) {
            System.out.println(lines[i]);
        }
    }
}
