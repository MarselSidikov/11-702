package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.UserForm;
import ru.itis.services.UsersService;
import ru.itis.models.User;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 26.02.2019
 * UsersController
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping(value = "/users")
    public String getUsersPage(@CookieValue("remember-me") String cookie, ModelMap model,
                               HttpServletResponse response) {
        System.out.println(cookie);
        List<User> users = usersService.getAllUsers();
        model.addAttribute("users", users);
        response.addCookie(new Cookie("MESSAGE", "ДАРОУ"));
        return "users_page";
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String postUser(UserForm userForm) {
        usersService.addUser(userForm);
        return "redirect:/users";
    }

    @RequestMapping(value = "/users/json", method = RequestMethod.POST,
    produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<User> postUserAsJson(@RequestBody UserForm userForm) {
        usersService.addUser(userForm);
        return usersService.getAllUsers();
    }
}
