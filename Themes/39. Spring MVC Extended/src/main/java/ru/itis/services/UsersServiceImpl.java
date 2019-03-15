package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.itis.UserForm;
import ru.itis.repositories.UsersRepository;
import ru.itis.models.User;

import java.util.List;

/**
 * 25.10.2018
 * UsersServiceImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public void addUser(UserForm userForm) {
        User user = User.builder()
                .name(userForm.getName())
                .age(userForm.getAge())
                .build();

        usersRepository.save(user);
    }
}
