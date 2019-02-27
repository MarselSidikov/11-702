package ru.itis.taxi.services;

import ru.itis.taxi.forms.UserForm;
import ru.itis.taxi.models.User;

import java.net.URL;

/**
 * 04.09.2018
 * UsersService
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public interface UsersService {
    void signUp(UserForm userForm);
}
