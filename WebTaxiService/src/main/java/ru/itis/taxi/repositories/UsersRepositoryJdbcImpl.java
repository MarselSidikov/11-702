package ru.itis.taxi.repositories;

import lombok.SneakyThrows;
import ru.itis.taxi.models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

/**
 * 02.10.2018
 * UsersRepositoryJdbcImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersRepositoryJdbcImpl implements UsersRepository {

    private Connection connection;

    //language=sql
    private static final String SQL_FIND_BY_ID =
            "select * from taxi_user where id = ?";

    private PreparedStatement findByIdStatement;

    @SneakyThrows
    public UsersRepositoryJdbcImpl(Connection connection) {
        this.connection = connection;
        findByIdStatement = connection.prepareStatement(SQL_FIND_BY_ID);
    }

    @Override
    public Optional<User> findByPhone(String phone) {
        return Optional.empty();
    }

    @Override
    public void save(User model) {

    }

    @Override
    public void update(User model) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    @SneakyThrows
    public User findOne(Long id) {
        findByIdStatement.setLong(1, id);
        ResultSet resultSet = findByIdStatement.executeQuery();
        resultSet.next();
        return User.builder()
                .id(resultSet.getLong("id"))
                .firstName(resultSet.getString("first_name"))
                .lastName(resultSet.getString("last_name"))
                .hashPassword(resultSet.getString("hash_password"))
                .build();
    }

    @Override
    public List<User> findAll() {
        return null;
    }
}
