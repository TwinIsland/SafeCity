function logoutAction(){
    $.ajax({
        url:"user/logout.action",
        type:"POST",
        success:window.location.href = "index.html"
    })
}