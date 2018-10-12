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

    //language=sql
    private static final String SQL_UPDATE_BY_ID =
            "update taxi_user set first_name = ?," +
                    "last_name = ?, email = ?, phone = ? where id = ?;";

    //language=sql
    private static final String SQL_INSERT_USER =
            "insert into taxi_user(first_name, last_name, email, hash_password) values (?, ?, ?, ?)";

    private PreparedStatement findByIdStatement;
    private PreparedStatement updateByIdStatement;
    private PreparedStatement insertStatement;
    @SneakyThrows
    public UsersRepositoryJdbcImpl(Connection connection) {
        this.connection = connection;
        findByIdStatement = connection.prepareStatement(SQL_FIND_BY_ID);
        updateByIdStatement = connection.prepareStatement(SQL_UPDATE_BY_ID);
        insertStatement = connection.prepareStatement(SQL_INSERT_USER);
    }

    @Override
    public Optional<User> findByPhone(String phone) {
        return Optional.empty();
    }

    @SneakyThrows
    @Override
    public void save(User model) {
        insertStatement.setString(1, model.getFirstName());
        insertStatement.setString(2, model.getLastName());
        insertStatement.setString(3, model.getEmail());
        insertStatement.setString(4, model.getHashPassword());
        int affectedRows = insertStatement.executeUpdate();
        if (affectedRows != 1) {
            throw new IllegalArgumentException("SQL Exception");
        }
    }

    @SneakyThrows
    @Override
    public void update(User model) {
        updateByIdStatement.setString(1, model.getFirstName());
        updateByIdStatement.setString(2, model.getLastName());
        updateByIdStatement.setString(3, model.getEmail());
        updateByIdStatement.setString(4, model.getPhone());
        updateByIdStatement.setLong(5, model.getId());
        int affectedRows = updateByIdStatement.executeUpdate();

        if (affectedRows != 1) {
            throw new IllegalArgumentException("SQL Exception");
        }
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
