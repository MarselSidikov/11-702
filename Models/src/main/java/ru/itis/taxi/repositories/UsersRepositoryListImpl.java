package ru.itis.taxi.repositories;

import ru.itis.taxi.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 04.09.2018
 * UsersRepositoryListImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersRepositoryListImpl implements UsersRepository {

    private List<User> users;

    public UsersRepositoryListImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public Optional<User> findByPhone(String phone) {
        User resultUser = null;
        for (User user : users) {
            if (user.getPhone().equals(phone)) {
                resultUser = user;
                break;
            }
        }
        return Optional.ofNullable(resultUser);
    }

    @Override
    public void save(User model) {
        users.add(model);
    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public User findOne(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
