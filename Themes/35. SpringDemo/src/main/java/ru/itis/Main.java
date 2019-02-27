package ru.itis;

import java.util.HashMap;

/**
 * 13.02.2019
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        Card card = new Card(300, "7777");
//        Terminal terminal = new TerminalStandardImpl();
//        ATM atm = new AtmTrivialImpl(350, terminal);
        Terminal terminal = new TerminalStandardImpl();
        ATM atm = new AtmExtendedImpl(300, terminal);
        atm.giveSum(300, card, "7777");
        atm.giveSum(300, card, "7777");
        atm.giveSum(500, card, "7777");

                Double
    }
}
