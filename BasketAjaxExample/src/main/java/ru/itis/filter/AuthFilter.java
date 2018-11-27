package ru.itis.filter;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.itis.models.Auth;
import ru.itis.repositories.AuthRepository;
import ru.itis.repositories.AuthRepositoryImpl;
import ru.itis.repositories.UsersRepository;
import ru.itis.repositories.UsersRepositoryJdbcTemplateImpl;
import ru.itis.services.LoginService;
import ru.itis.services.LoginServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 24.10.2018
 * AuthFilter
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@WebFilter("/users")
public class AuthFilter implements Filter {

    private LoginService service;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("postgres");
        dataSource.setPassword("qwerty007");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/shop");
        UsersRepository usersRepository = new UsersRepositoryJdbcTemplateImpl(dataSource);
        AuthRepository authRepository = new AuthRepositoryImpl(dataSource);
        this.service = new LoginServiceImpl(authRepository, usersRepository);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        // явное преобразование запросов
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        // вытаскиваем из запроса куки
        Cookie cookies[] = request.getCookies();
        // выставляем флажок в false
        boolean exists = false;
        // если куков нет, создаем пустой массив куков
        if (cookies == null) {
            cookies = new Cookie[0];
        }
        // смотрим каждую куку
        for (Cookie cookie : cookies) {
            // если нашли куку с именем auth
            if (cookie.getName().equals("auth")) {
                // и при этом ее нет в БД
                if (!service.isExistByCookie(cookie.getValue())) {
                    // делаем редирект на login
                    response.sendRedirect("/login");
                    // останавливаем работу фильтра
                    return;
                } else {
                    // если все норм - флажок true
                    exists = true;
                }
            }
        }
        // если флажок так и остался false
        if (!exists) {
            // редирект на логин
            response.sendRedirect("/login");
        } else {
            // если все ок - отдаем запрос дальше (либо сервлетам, либо другим фильтрам
            chain.doFilter(request, response);
        }

    }

    @Override
    public void destroy() {

    }
}
