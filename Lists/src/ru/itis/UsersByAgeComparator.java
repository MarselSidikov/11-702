package ru.itis;

import java.util.Comparator;

/**
 * 28.02.2018
 * UsersByAgeComparator
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersByAgeComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getAge() - o2.getAge();
    }
}
