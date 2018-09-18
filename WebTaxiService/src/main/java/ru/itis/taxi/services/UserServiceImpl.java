package ru.itis.taxi.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.itis.taxi.models.User;
import ru.itis.taxi.repositories.UsersRepository;

import java.net.URL;
import java.util.Optional;

/**
 * 04.09.2018
 * UserServiceImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UserServiceImpl implements UsersService {

    private UsersRepository usersRepository;

    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public void register(String phone, String password) {
        User user = User.builder()
                .phone(phone)
                .hashPassword(passwordEncoder.encode(password))
                .build();
        usersRepository.save(user);
    }

    @Override
    public URL getPhotoByPhone(String phone) {
        Optional<User> user = usersRepository.findByPhone(phone);
        return user.map(User::getPhoto).orElse(null);
    }

    @Override
    public User findByPhone(String phone) {
        return usersRepository.findByPhone(phone).orElse(null);
    }

    @Override
    public boolean isRegistered(String phone, String password) {
        Optional<User> candidateUser = usersRepository.findByPhone(phone);
        return candidateUser.filter(user -> passwordEncoder.matches(password, user.getHashPassword())).isPresent();
    }
}
