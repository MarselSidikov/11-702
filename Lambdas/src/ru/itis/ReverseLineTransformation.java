package ru.itis;

/**
 * 21.11.2017
 * ReverseLineTransformation
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class ReverseLineTransformation implements LineTransformation {
    @Override
    public String transform(String line) {
        StringBuilder builder = new StringBuilder();
        char lineAsCharArray[] = line.toCharArray();
        for (int i = lineAsCharArray.length - 1; i >= 0; i--) {
            builder.append(lineAsCharArray[i]);
        }
        return builder.toString();
    }
}
