package ru.itis;

/**
 * 13.02.2019
 * TerminalStandardImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class TerminalStandardImpl implements Terminal {
    public void onStart(String message) {
        System.out.println(message);
    }

    public void onIncorrectPassword() {
        System.out.println("Пароль неверный");
    }

    public void onIncorrectSumOnCard() {
        System.out.println("Денег на карте нет");
    }

    public void onIncorrectSumInAtm() {
        System.out.println("Денег в банкомате нет");
    }

    public void onSuccess() {
        System.out.println("Возьмите ваши деньги");
    }
}
