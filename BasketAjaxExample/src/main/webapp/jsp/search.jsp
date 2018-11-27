<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 27.11.2018
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script
            src="https://code.jquery.com/jquery-3.3.1.min.js"
            integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
            crossorigin="anonymous"></script>
</head>
<body>
<div>
    <input id="q" type="text" onkeyup="search(document.getElementById('q').value)">
    <br>
    <div id="products_table">

    </div>
</div>

<script>
    function search(query) {
        $.ajax({
            type: 'GET',
            url: '/search',
            data: {
                q: query
            }
        }).done(function (data) {
            let tableHtml = "";
            tableHtml += '<table>';
            tableHtml +=
                '<tr>' +
                '<th>' +
                'id' +
                '</th>' +
                '<th>' +
                'title' +
                '</th>' +
                '</tr>';

            for (let i = 0; i < data.length; i++) {
                tableHtml += '<tr>' +
                    '<td>' + data[i].id + '</td>' +
                    '<td>' + data[i].title + '</td>' +
                    '</tr>';
            }
            tableHtml += '</table>';
            $("#products_table").html(tableHtml);
        }).fail(function () {
            alert('ALL BAD')
        });
    }
</script>
</body>

</html>
