package ru.itis;

/**
 * 28.02.2018
 * MainUsers
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainUsers {
    public static void main(String[] args) {
        User maxim = new User("Максим", 18, 168, 4);
        User diana = new User("Диана", 18, 154, 4);
        User ilnur = new User("Ильнур",19, 170, 5);
        User irina = new User("Ирина", 17, 162, 4);
        User marsel = new User("Марсель", 24, 185, 3);

        ArrayList<User> users = new ArrayList<>();
        users.add(maxim);
        users.add(diana);
        users.add(ilnur);
        users.add(irina);
        users.add(marsel);

        ArrayList.sort(users);

        System.out.println("По росту");
        for (User user : users) {
            System.out.println(user);
        }

        UsersByAgeComparator comparator = new UsersByAgeComparator();

        ArrayList.sort(users, comparator);

        System.out.println("По возрасту");
        for (User user : users) {
            System.out.println(user);
        }

        ArrayList.sort(users, (userA, userB) ->
            userB.getMark() - userA.getMark());

        System.out.println("По оценкам");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
