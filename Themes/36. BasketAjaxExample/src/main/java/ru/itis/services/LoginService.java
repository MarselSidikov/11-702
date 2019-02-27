package ru.itis.services;

import ru.itis.forms.LoginForm;
import ru.itis.models.Auth;

import java.util.Optional;

/**
 * 24.10.2018
 * LoginService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface LoginService {
    Optional<String> login(LoginForm loginForm);
    boolean isExistByCookie(String cookieValue);
}
