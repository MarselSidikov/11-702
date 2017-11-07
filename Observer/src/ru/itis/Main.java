package ru.itis;

import ru.itis.observer.CharacterObserver;
import ru.itis.observer.DigitsObserver;
import ru.itis.observer.LettersObserver;
import ru.itis.observer.UpercaseObserver;

public class Main {

    public static void main(String[] args) {
        LettersObserver lettersObserver = new LettersObserver();
        DigitsObserver digitsObserver = new DigitsObserver();
        UpercaseObserver upercaseObserver = new UpercaseObserver();

        CharacterObserver lowerCaseObserver = new CharacterObserver() {
            @Override
            public void handle(char character) {
                if (Character.isLowerCase(character)) {
                    System.out.println("тут маленькая буква: " + character);
                }
            }
        };

        CharacterObserver aLetterObserver = character -> {
            if (character == 'a' || character == 'A') {
                System.out.println("ААААААААААААААААААААААААААААААААА");
            }
        };

        TextParser parser = new TextParser();
        parser.addObserver(lettersObserver);
        parser.addObserver(digitsObserver);
        parser.addObserver(upercaseObserver);
        parser.addObserver(lowerCaseObserver);

        String words[] = parser.parse("Hello, my name is Marsel007");

        System.out.println(lettersObserver.getCount());
        System.out.println(digitsObserver.getCount());


    }
}
