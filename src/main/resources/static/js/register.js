$(function () {
    $("#submit").click(function () {
        $.ajax({
            url:"/user/register",
            type:"POST",
            data:{
                name:$("#usrName").val(),
                password:$("#usrPsw").val(),
                realname:$("#realname").val(),

            },
            success:function (result) {
                if(result === "success"){
                    alert("注册成功")
                    window.location.href = "../html/login.html";
                }else{
                    alert("注册失败")
                }
            }
        })
    })
})