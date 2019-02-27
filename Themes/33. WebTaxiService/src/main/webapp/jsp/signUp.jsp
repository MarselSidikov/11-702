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
        <h1><a href="/signUp?lang=ru">RU</a>|<a href="/signUp?lang=en">EN</a></h1>
        <fieldset>
            <legend>${language.get("signup.personal")}</legend>
            <label for="first_name"><span>${language.get("signup.firstname")}</span><input id="first_name" name="first_name"
                                                                                                 type="text"
                                                                                                 class="input-field"
                                                                                                 value=""/></label>
            <label for="last_name"><span>${language.get("signup.lastname")}</span><input id="last_name" name="last_name"
                                                                                               type="text"
                                                                                               class="input-field"
                                                                                               value=""/></label>
            <label for="email"><span>${language.get("signup.email")}</span><input id="email" type="email" name="email"
                                                                                        class="input-field"
                                                                                        value=""/></label>
            <label for="password"><span>${language.get("signup.password")}</span><input id="password" name="password"
                                                                                              type="password"
                                                                                              class="input-field"
                                                                                              value=""/></label>
        </fieldset>
        <fieldset>
            <label><span>&nbsp;</span><input type="submit" value="${language.get("signup.signup")}"/></label>
        </fieldset>
    </form>
</div>
</body>
</html>
