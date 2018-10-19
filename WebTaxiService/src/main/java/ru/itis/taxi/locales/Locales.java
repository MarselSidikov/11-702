package ru.itis.taxi.locales;

import java.util.HashMap;
import java.util.Map;

/**
 * 17.10.2018
 * Locales
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Locales {
    public static Map<String, String> ENG = new HashMap<>();
    public static Map<String, String> RU = new HashMap<>();
    static {
        ENG.put("signup.personal", "Personal");
        ENG.put("signup.firstname", "First Name");
        ENG.put("signup.lastname", "Last Name");
        ENG.put("signup.email", "Email");
        ENG.put("signup.password", "Password");
        ENG.put("signup.signup", "Sign Up");

        ENG.put("signin.login", "Login");
        ENG.put("signin.email", "Email");
        ENG.put("signin.password", "Password");
        ENG.put("signin.signin", "Sign In");

        RU.put("signup.personal", "Информация о вас");
        RU.put("signup.firstname", "Имя");
        RU.put("signup.lastname", "Фамиля");
        RU.put("signup.email", "Мыло");
        RU.put("signup.password", "Пароль");
        RU.put("signup.signup", "Зарегистрироваться");

        RU.put("signin.login", "Вход");
        RU.put("signin.email", "Мыло");
        RU.put("signin.password", "Пароль");
        RU.put("signin.signin", "Войти");
    }
}
