package ru.itis.taxi.app;

import ru.itis.taxi.models.User;
import ru.itis.taxi.repositories.UsersRepository;
import ru.itis.taxi.repositories.UsersRepositoryListImpl;
import ru.itis.taxi.services.UserServiceImpl;
import ru.itis.taxi.services.UsersService;

/**
 * 04.09.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        UsersRepository usersRepository = new UsersRepositoryListImpl();
        UsersService usersService = new UserServiceImpl(usersRepository);
        usersService.register("79372824941", "qwerty007");
        System.out.println(usersService.findByPhone("79372824941"));
        System.out.println(usersService.isRegistered("79372824942", "qwerty007"));
    }
}
