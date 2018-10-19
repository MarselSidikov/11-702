<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 12.10.2018
  Time: 12:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="/css/styles.css" rel="stylesheet">
</head>
<body>
<div class="form-style-3">
    <form method="post">
        <h1><a href="/login?lang=ru">RU</a>|<a href="/login?lang=en">EN</a></h1>
        <fieldset>
            <legend>${language.get("signin.login")}</legend>
            <label for="email"><span>${language.get("signin.email")}</span><input id="email" type="email" name="email"
                                                                                  class="input-field"
                                                                                  value=""/></label>
            <label for="password"><span>${language.get("signin.password")}</span><input id="password" name="password"
                                                                                        type="password"
                                                                                        class="input-field"
                                                                                        value=""/></label>
        </fieldset>
        <fieldset>
            <label><span>&nbsp;</span><input type="submit" value="${language.get("signin.signin")}"/></label>
        </fieldset>
    </form>
</div>
</body>
</html>
