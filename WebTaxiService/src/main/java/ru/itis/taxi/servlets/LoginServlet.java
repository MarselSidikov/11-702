package ru.itis.taxi.servlets;

import javax.servlet.ServletException;
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
        PrintWriter writer = response.getWriter();

        response.setHeader("Content-Type", "text/html");
        writer.write("<form action='http://localhost:8080/login' method='post'>");
        writer.write("  <input type='text' name='login' placeholder='Login'>");
        writer.write("  <input type='password' name='password' placeholder='Password'>");
        writer.write("  <input type='submit' name='' value='Enter!'>");
        writer.write("</form>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        System.out.println(login + " " + password);
    }
}
