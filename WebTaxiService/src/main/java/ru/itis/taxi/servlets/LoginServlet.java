package ru.itis.taxi.servlets;

import ru.itis.taxi.locales.Locales;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 18.09.2018
 * LoginServlet
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/signIn.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        System.out.println(login + " " + password);
    }
}
