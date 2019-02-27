package ru.itis;

import ru.itis.observer.CharacterObservable;
import ru.itis.observer.CharacterObserver;

/**
 * 07.11.2017
 * TextParser
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class TextParser implements CharacterObservable {

    private CharacterObserver observers[];
    private int countObservers;


    public TextParser() {
        this.observers = new CharacterObserver[5];
        this.countObservers = 0;

    }

    // принимает на вход строку text и разбивает ее по пробелам
    public String[] parse(String text) {
        char textAsCharArray[] = text.toCharArray();
        String words[] = new String[100];
        int count = 0;
        StringBuilder currentWord = new StringBuilder();
        // бежим по всем символам строки
        for (int i = 0; i < textAsCharArray.length; i++) {
            // если встретили символ, отличный от пробела
            if (textAsCharArray[i] != ' ') {
                // присоединяем этот символ к текущему слову
                currentWord.append(textAsCharArray[i]);
                notifyAll(textAsCharArray[i]);
            } else {
                // если встретили пробел - то кидаем слово, которое
                // мы собрали в массив
                words[count] = currentWord.toString();
                // создаем объект для нового слова
                currentWord = new StringBuilder();
                count++;
            }
        }
        words[count] = currentWord.toString();
        return words;
    }

    @Override
    public void addObserver(CharacterObserver characterObserver) {
        observers[countObservers] = characterObserver;
        countObservers++;
    }

    @Override
    public void notifyAll(char character) {
        for (int i = 0; i < countObservers; i++) {
            observers[i].handle(character);
        }
    }
}
