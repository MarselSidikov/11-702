package ru.itis.taxi.filters;

import ru.itis.taxi.locales.Locales;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 17.10.2018
 * LocaleFilter
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@WebFilter("*")
public class LocaleFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        String lang = request.getParameter("lang");
        if (lang == null) {
            boolean cookieFound = false;
            Cookie cookies[] = request.getCookies();
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("lang")) {
                    lang = cookie.getValue();
                    cookieFound = true;
                }
            }
            if (!cookieFound) {
                lang = "en";
            }
        } else {
            Cookie cookie = new Cookie("lang", lang);
            cookie.setMaxAge(60 * 60 * 24 * 7);
            response.addCookie(cookie);
        }

        if (lang.equals("en")) {
            request.setAttribute("language", Locales.ENG);
        } else if (lang.equals("ru")) {
            request.setAttribute("language", Locales.RU);
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
