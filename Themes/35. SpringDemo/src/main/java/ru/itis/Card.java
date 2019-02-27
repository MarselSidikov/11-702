package ru.itis;

/**
 * 13.02.2019
 * Card
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Card {
    private int totalSum;
    private String password;

    public Card(int totalSum, String password) {
        this.totalSum = totalSum;
        this.password = password;
    }

    public boolean isValidPassword(String password) {
        return this.password.equals(password);
    }

    public boolean isCorrectSum(int sum) {
        return this.totalSum >= sum;
    }
}
