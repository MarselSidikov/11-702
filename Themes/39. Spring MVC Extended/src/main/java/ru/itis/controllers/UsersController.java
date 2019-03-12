package ru.itis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.itis.services.UsersService;
import ru.itis.models.User;

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

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ModelAndView getUsersPage() {
        List<User> users = usersService.getAllUsers();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users", users);
        modelAndView.setViewName("users_page");
        return modelAndView;
    }
}
