$(function () {
    $("#btn3").click(function () {
        $.ajax({
            url:"/user/register",
            type:"POST",
            data:{
                name:$("#usrName").val(),
                password:$("#usrPsw").val(),
                realname:$("#relnam").val(),
            },
            success:function (result) {
                if(result === "success"){
                    $("#status").empty().append("<p style=\"color: forestgreen;font-size: 13px\">&nbsp;&nbsp;&nbsp;&nbsp;注册成功，欢迎！</p>")
                    window.location.href = "index.html";
                }else{
                    $("#status").empty().append("<p style=\"color: red;font-size: 13px\">&nbsp;&nbsp;&nbsp;&nbsp;用户名已被占用，请重试！</p>")
                    document.getElementById("usrName").value="";
                    document.getElementById("usrPsw").value="";
                    document.getElementById("relnam").value="";
                }
            }
        })
    })
})