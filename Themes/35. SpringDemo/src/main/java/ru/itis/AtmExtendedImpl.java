package ru.itis;

/**
 * 13.02.2019
 * AtmExtendedImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class AtmExtendedImpl implements ATM {

    private int totalSum;
    private Terminal terminal;

    public AtmExtendedImpl(int totalSum, Terminal terminal) {
        this.totalSum = totalSum;
        this.terminal = terminal;
    }

    public int giveSum(int sum, Card card, String password) {
        terminal.onStart("Начинаем работу");
        if (card.isValidPassword(password)) {
            if (card.isCorrectSum(sum)) {
                if (this.totalSum >= sum) {
                    this.totalSum -= sum;
                    terminal.onSuccess();
                    return sum;
                } else terminal.onIncorrectSumInAtm();
            } else terminal.onIncorrectSumOnCard();
        } else terminal.onIncorrectPassword();
        return -1;
    }
}
