$(function () {
    isLogin()
    $("#submit").click(function () {
        if(!validate()){
            $("#status").empty().append("<p style=\"color: red;font-size: 13px\">&nbsp;&nbsp;&nbsp;&nbsp;验证码错误！</p>")
            createCode();
            $("#capCode").empty()
        }else {
            $.ajax({
                url: "user/login",
                type: "POST",
                data: {
                    name: $("#usrName").val(),
                    password: $("#usrPsw").val(),
                },
                success: function (result) {
                    if (result === "success") {
                        $("#status").empty().append("<p style=\"color: forestgreen;font-size: 13px\">&nbsp;&nbsp;&nbsp;&nbsp;登陆成功，欢迎！</p>")
                        window.location.href = 'index.html';
                    } else {
                        $("#status").empty().append("<p style=\"color: red;font-size: 13px\">&nbsp;&nbsp;&nbsp;&nbsp;用户名或密码错误，请重试！</p>")
                        document.getElementById("usrName").value = "";
                        document.getElementById("usrPsw").value = "";
                    }
                }
            })
        }
    })
})