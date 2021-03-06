package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itis.models.User;
import ru.itis.repositories.UsersRepository;

import java.util.List;

/**
 * 23.10.2018
 * UsersServiceImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<User> getUsers() {
        return usersRepository.findAll();
    }
}
