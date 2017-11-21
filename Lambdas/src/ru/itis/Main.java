package ru.itis;

public class Main {

    public static void main(String[] args) {
        TextProcessor processor = new TextProcessor();
        processor.add("Максим");
        processor.add("Диана");
        processor.add("Никита");
        processor.add("Даша");
        processor.add("Алмаз");
        processor.add("Вадим");

        ReverseLineTransformation reverseLineTransformation =
                new ReverseLineTransformation();

        LineTransformation transformationToTitle = new LineTransformation() {
            @Override
            public String transform(String line) {
                StringBuilder builder = new StringBuilder();
                char lineAsCharArray[] = line.toCharArray();
                for (int i = 0; i < lineAsCharArray.length; i++) {
                    builder.append(Character.toTitleCase(lineAsCharArray[i]));
                }
                return builder.toString();
            }

            ;
        };


        processor.process(reverseLineTransformation);
        processor.process(transformationToTitle);
        // лямбда выражение - анонимный класс функционального интерфейса
        processor.process((line) -> {
            StringBuilder builder = new StringBuilder();
            char lineAsCharArray[] = line.toCharArray();
            for (char character : lineAsCharArray) {
                builder.append(Character.toLowerCase(character));
            }
            return builder.toString();
        });
        processor.printLines();
    }
}
