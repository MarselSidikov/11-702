package ru.itis;

/**
 * 13.02.2019
 * TerminalBadImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class TerminalBadImpl implements Terminal {
    public void onStart(String message) {
        System.err.println("Уходи");
    }

    public void onIncorrectPassword() {
        System.err.println("Уходи");
    }

    public void onIncorrectSumOnCard() {
        System.err.println("Уходи");
    }

    public void onIncorrectSumInAtm() {
        System.err.println("Уходи");
    }

    public void onSuccess() {
        System.err.println("С вас 5000 рублей");
    }
}
