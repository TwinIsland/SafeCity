function isLogin(){
    return $.ajax({
        url: "user/isLogin.action",
        type: "GET",
        success: function (result) {
            if(result){
                document.getElementById("register").style.display = "none"
                document.getElementById("login").style.display = "none"
            }else{
                document.getElementById("dashboard").style.display = "none"
                document.getElementById("logout").style.display = "none"
            }
        },
    });
}