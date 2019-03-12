<html>
<head>
<link rel="stylesheet" type="text/css" href="static/css/style.css">
</head>
<body>
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
</body>
</html>