$(function (){
    $("#mytable").bootstrapTable({
        url:"user/getUser",  //请求地址
        striped : true, //是否显示行间隔色
        pageNumber : 1, //初始化加载第一页
        pagination : true,//是否分页
        sidePagination : 'client',//server:服务器端分页|client：前端分页
        pageSize : 5,//单页记录数
        pageList : [ 5, 10],//可选择单页记录数
        showRefresh : true,//刷新按钮

        columns : [ {
            title : 'ID',
            field : 'id',
            sortable : true
        }, {
            title : '用户名',
            field : 'name',
            sortable : true
        }, {
            title : '权限',
            field : 'level',
            sortable : true
        }, {
            title : '真实姓名',
            field : 'realname',
            sortable : true
        }]
    })
})

function resetTable(){
    $("#mytable").bootstrapTable("refresh",{
        url:"user/getUser",  //请求地址
        striped : true, //是否显示行间隔色
        pageNumber : 1, //初始化加载第一页
        pagination : true,//是否分页
        sidePagination : 'client',//server:服务器端分页|client：前端分页
        pageSize : 5,//单页记录数
        pageList : [5, 10],//可选择单页记录数
        //showRefresh : false,//刷新按钮

        columns : [ {
            title : 'ID',
            field : 'id',
            sortable : true
        }, {
            title : '用户名',
            field : 'name',
            sortable : true
        }, {
            title : '权限',
            field : 'level',
            sortable : true
        }, {
            title : '真实姓名',
            field : 'realname',
            sortable : true
        }]
    })
}