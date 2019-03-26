<#ftl encoding='UTF-8'>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="static/css/style.css">
    <script
            src="http://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>
    <script src="static/js/main.js"></script>
</head>
<body>
<#--<div>-->
<#--<form action="/users" method="post">-->
<#--<input name="name" placeholder="Name">-->
<#--<input name="age" placeholder="Age">-->
<#--<input type="submit" value="Send">-->
<#--</form>-->
<#--</div>-->
<div>
    <input id="name" placeholder="Имя">
    <input id="age" placeholder="Возраст">
    <button onclick="addUser($('#name').val(), $('#age').val())">Добавить</button>
</div>
<div>
    <table id="users">
        <tr>
            <th>ID</th>
            <th>Name</th>
        </tr>
        <#list users as user>
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>