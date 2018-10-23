package ru.itis.services;

import ru.itis.models.User;
import ru.itis.forms.UserForm;
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

    private UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public void addUser(UserForm userForm) {
        User user = User.builder()
                .name(userForm.getName())
                .build();

        usersRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return usersRepository.findAll();
    }
}
