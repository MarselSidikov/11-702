package ru.itis.taxi.app;

import lombok.SneakyThrows;
import ru.itis.taxi.models.Role;
import ru.itis.taxi.models.User;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * 25.09.2018
 * MainDbConnection
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainDbConnection {
    @SneakyThrows
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.load(new FileReader("C:\\Users\\admin.WIN-IPM3OA3VQNQ\\Desktop\\Java\\11-702\\WebTaxiService\\src\\main\\resources\\ru.itis\\application.properties"));
        Connection connection =
                DriverManager.getConnection(properties.getProperty("db.url"),
                        properties.getProperty("db.user"),
                        properties.getProperty("db.password"));

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from taxi_user");
        resultSet.next();
        User user = User.builder()
                .id(resultSet.getLong("id"))
                .firstName(resultSet.getString("first_name"))
                .lastName(resultSet.getString("last_name"))
                .role(Role.valueOf(resultSet.getString("role")))
                .build();
        System.out.println(user);
    }
}
