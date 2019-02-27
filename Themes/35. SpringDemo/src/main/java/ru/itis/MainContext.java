package ru.itis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 13.02.2019
 * MainContext
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainContext {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        Card card = context.getBean("card", Card.class);
        ATM atm = context.getBean("atm", ATM.class);
        atm.giveSum(100, card, "32423");
        int i = 0;
    }
}
