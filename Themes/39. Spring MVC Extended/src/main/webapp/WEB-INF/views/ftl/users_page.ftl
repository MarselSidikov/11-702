<html>
<head>
    <link rel="stylesheet" type="text/css" href="static/css/style.css">
</head>
<body>
<div>
    <form action="/users" method="post">
        <input name="name" placeholder="Name">
        <input name="age" placeholder="Age">
        <input type="submit" value="Send">
    </form>
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