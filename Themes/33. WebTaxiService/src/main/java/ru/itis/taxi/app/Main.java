package ru.itis.taxi.app;

import lombok.SneakyThrows;
import ru.itis.taxi.models.User;
import ru.itis.taxi.repositories.UsersRepository;
import ru.itis.taxi.repositories.UsersRepositoryJdbcImpl;
import ru.itis.taxi.services.UserServiceImpl;
import ru.itis.taxi.services.UsersService;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * 04.09.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.load(new FileReader("C:\\Users\\admin.WIN-IPM3OA3VQNQ\\Desktop\\Java\\11-702\\WebTaxiService\\src\\main\\resources\\ru.itis\\application.properties"));
        Connection connection =
                DriverManager.getConnection(properties.getProperty("db.url"),
                        properties.getProperty("db.user"),
                        properties.getProperty("db.password"));
        UsersRepository usersRepository = new UsersRepositoryJdbcImpl(connection);
        System.out.println(usersRepository.findOne(1L));
    }
}
