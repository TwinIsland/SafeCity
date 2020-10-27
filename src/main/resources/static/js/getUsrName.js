function getUsrName() {
    $.ajax({
        url: "user/getName",
        type: "GET",
        success: function (result) {
            if (result !== "false") {
                return result;
            }
            return "unknown"
        }
    })
}