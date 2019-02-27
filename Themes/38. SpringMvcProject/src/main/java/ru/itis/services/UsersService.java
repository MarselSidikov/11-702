package ru.itis.services;

import ru.itis.models.User;

import java.util.List;

/**
 * 23.10.2018
 * UsersService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersService {
    List<User> getUsers();
}
