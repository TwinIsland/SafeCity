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
                    alert("注册成功")
                    window.location.href = "../html/login.html";
                }else{
                    alert("注册失败,已存在相同用户名")
                }
            }
        })
    })
})