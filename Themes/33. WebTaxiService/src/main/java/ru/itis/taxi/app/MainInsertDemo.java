package ru.itis.taxi.app;

import lombok.SneakyThrows;
import ru.itis.taxi.models.Role;
import ru.itis.taxi.models.User;

import java.io.FileReader;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

/**
 * 02.10.2018
 * MainInsertDemo
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MainInsertDemo {
    @SneakyThrows
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.load(new FileReader("C:\\Users\\admin.WIN-IPM3OA3VQNQ\\Desktop\\Java\\11-702\\WebTaxiService\\src\\main\\resources\\ru.itis\\application.properties"));
        Connection connection =
                DriverManager.getConnection(properties.getProperty("db.url"),
                        properties.getProperty("db.user"),
                        properties.getProperty("db.password"));


        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();

//        Statement statement = connection.createStatement();
//        String query = "insert into taxi_user(first_name, last_name) values ('" + firstName + "','" + lastName + "');";
//        System.out.println(query);
//        statement.executeUpdate(query);
        PreparedStatement statement = connection.prepareStatement("insert into taxi_user(first_name, last_name) values (?, ?)");
        statement.setString(1, firstName);
        statement.setString(2, lastName);
        statement.executeUpdate();
    }
}
