$(function () {
    $("#submit").click(function () {
        $.ajax({
            url:"/user/login",
            type:"post",
            data:{
                name:$("#usrName").val,
                password:$("#usrPsw").val,
            },
            success:function (result) {
                if(result === "success"){
                    alert("登陆成功")
                }else{
                    alert("登陆失败")
                }
            }
        })
    })
})