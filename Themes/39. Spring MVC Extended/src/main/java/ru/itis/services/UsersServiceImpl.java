package ru.itis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public void addUser(UserForm userForm) {
        // TODO: пример проверки
//        if (passwordEncoder.matches(userForm.getPassword(), hash)) { ... }
        User user = User.builder()
                .name(userForm.getName())
                .age(userForm.getAge())
                .passwordHash(passwordEncoder.encode(userForm.getPassword()))
                .build();

        usersRepository.save(user);
    }
}
