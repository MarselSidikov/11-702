function addUser(name, age) {

    let newUser = {
        "name": name,
        "age": age
    };

    $.ajax({
        type: "POST",
        url: "/users/json",
        data: JSON.stringify(newUser),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (response) {
            alert(JSON.stringify(response));
        },
        failure: function (errMsg) {
            alert(errMsg);
        }
    });
}