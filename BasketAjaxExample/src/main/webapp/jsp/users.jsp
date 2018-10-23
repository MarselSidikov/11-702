<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script
            src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>
    <title>Users</title>
</head>
<script>
    function sendUser(name) {
        $.ajax({
            type: 'POST',
            url: '/users',
            data: {
                name : name
            }
        }).done(function(data) {
            let divTable = document.getElementById('users_table');
            let tableHtml = "";
            tableHtml += '<table>';
            tableHtml +=
                '<tr>' +
                    '<th>' +
                        'id' +
                    '</th>' +
                    '<th>' +
                        'name' +
                    '</th>' +
                '</tr>';

            for (let i = 0; i < data.length; i++) {
                tableHtml += '<tr>' +
                        '<td>' + data[i].id + '</td>' +
                        '<td>' + data[i].name + '</td>' +
                        '</tr>';
            }
            tableHtml += '</table>';
            divTable.innerHTML = tableHtml;
        }).fail(function() {
            alert('ALL BAD')
        });
    }
</script>
<body>
    <div>
        <label for="name">Имя пользователя</label>
        <br>
        <input id="name" placeholder="Name">
        <br>
        <button onclick="sendUser(document.getElementById('name').value)" id="send">Send</button>
    </div>
    <div id="users_table">

    </div>
</body>
</html>
