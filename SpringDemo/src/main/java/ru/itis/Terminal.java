package ru.itis;

/**
 * 13.02.2019
 * Terminal
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface Terminal {
    void onStart(String message);
    void onIncorrectPassword();
    void onIncorrectSumOnCard();
    void onIncorrectSumInAtm();
    void onSuccess();
}
