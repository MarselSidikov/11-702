<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <script
            src="https://code.jquery.com/jquery-3.4.0.js"
            integrity="sha256-DYZMCC8HTC+QDr5QNaIcfR7VSPtcISykd+6eSmBW5qo="
            crossorigin="anonymous"></script>
</head>
<body onload="renderUsers()">
<div>
    <form action="/users/1" method="post">
        <input name="firstName">
        <input name="lastName">
        <input type="submit">
    </form>
</div>
<div>
    <input id="firstName" name="firstName">
    <input id="lastName" name="lastName">
    <button onclick="addUser($('#firstName').val(), $('#lastName').val())">Добавить</button>
</div>
<script>
    function renderUsers() {
        $.getJSON( "/users.json", function( data ) {
            var items = [];
            $.each( data, function( key, val ) {
                items.push( "<li id='" + key + "'>" + val['firstName'] +' ' + val['lastName'] + "</li>" );
            });

            $( "<ul/>", {
                "class": "my-new-list",
                html: items.join( "" )
            }).appendTo( "body" );
        });
    }

    function addUser(firstName, lastName) {
        let user = {'firstName' : firstName, 'lastName': lastName};
        $.ajax({
            type: "POST",
            url: "/users",
            // The key needs to match your method's input parameter (case-sensitive).
            data: JSON.stringify(user),
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            success: function () {
                alert("Hello");
            }
        }) ;
    }
</script>
</body>
</html>