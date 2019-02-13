package ru.itis;

/**
 * 13.02.2019
 * AtmTrivialImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class AtmTrivialImpl implements ATM {

    private int totalSum;
    private Terminal terminal;

    public AtmTrivialImpl(int totalSum, Terminal terminal) {
        this.totalSum = totalSum;
        this.terminal = terminal;
    }

    public int giveSum(int sum, Card card, String password) {
        terminal.onStart("Банкомат не поддерживает карты и пароли");
        if (sum <= totalSum) {
            totalSum -= sum;
            terminal.onSuccess();
            return sum;
        } else terminal.onIncorrectSumInAtm();
        return -1;
    }
}
