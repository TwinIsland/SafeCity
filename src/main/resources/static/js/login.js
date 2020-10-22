<script>
$(function () {
    $("#btn").click(function () {
        $.ajax({
            url:"/user/login",
            type:"post",
            data:{
                name:$("#name").val(),
                password:$("#password").val(),
            },
            success:function (result) {
                if(result == "success"){
                    alert("登陆成功")
                }else{
                    alert("登陆失败")
                }
            }
        })
    })
})
</script>