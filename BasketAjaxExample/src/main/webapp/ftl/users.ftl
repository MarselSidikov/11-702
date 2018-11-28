<!DOCTYPE html>
<html>
<head>
    <title>FreeMarker test</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
Hello Dear Friend
<table>
    <tr>
        <th>Name</th>
        <th>Price</th>
    </tr>
            <#list users as user>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.name}</td>
                </tr>
            </#list>
</table>
</body>
</html>