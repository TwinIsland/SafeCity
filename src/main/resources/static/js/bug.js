$(document).ready(function () {
    window.operateEvents = {
        "click #TableEditor": function (e,vlaue,row,index) {
            window.location.href = 'index.html';
        },
    }
    $("#mytable").bootstrapTable({
        url:"/user/bug",  //请求地址
        striped : true, //是否显示行间隔色
        pageNumber : 1, //初始化加载第一页
        pagination : true,//是否分页
        sidePagination : 'client',//server:服务器端分页|client：前端分页
        pageSize : 5,//单页记录数
        pageList : [ 5, 10],//可选择单页记录数
        showRefresh : true,//刷新按钮
        columns : [ {
            title : '害虫名',
            field : 'name',
            sortable : true
        }, {
            title : '天敌',
            field : 'host',
            sortable : true
        }, {
            title : '主要危害',
            field : 'damage',
            sortable : true
        }, {
            title : '操作',
            field : 'Button',
            events : operateEvents, //给按钮注册事件
            formatter : AddFunctionAlty, //表格中增加按钮
        }]
    })
    function AddFunctionAlty(e,value,row,index){
        return[
            '<button id="TableEditor" style="color: #0d95e8" type="button" class="btn btn-default">查看详情</button>'
        ].join("")
    }
})