$(document).ready(function () {
    $("#mytable").bootstrapTable({
        url:"/info/bug",  //请求地址
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
            field : 'name',
            //events : operateEvents, //给按钮注册事件
            formatter : actionFormatter, //表格中增加按钮
        }]
    })
})
//列表行操作按钮
function actionFormatter(value,row,index){
    var name = value;
    var result = "";
    //return '<button id="TableEditor" style="color: #0d95e8" type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal">查看详情</button>'
    result += "<a href='javascript:;' class='btn btn-xs green' onclick=\"bugName('" + name + "', view='view')\" title='查看详情' data-toggle=\"modal\" data-target=\"#myModal\">查看详情<span class='glyphicon glyphicon-hand-up'></span></a>";
    return result;
}

//根据name查看详情
function bugName(name) {
    $.ajax({
        url:"/user/findOneBug",
        type:"post",
        data:{bugName:name},
        success:showQuery
    });
}
function  showQuery(bugEntity) {
    $("#modeltable").empty();
    var table_content = $(
        "<tr><td class='column'>虫名：</td>" +
        "<td>" + bugEntity.name + "</td></tr>" +
        "<tr><td class='column'>繁殖：</td>" +
        "<td>" + bugEntity.breed + "</td></tr>" +
        "<tr> <td class='column'>寄主：</td>" +
        "<td>" + bugEntity.host + "</td></tr>" +
        "<tr> <td class='column'>天敌：</td>" +
        "<td>" + bugEntity.enemy + "</td></tr>" +
        "<tr> <td class='column'>主要危害：</td>" +
        "<td>" + bugEntity.damage + "</td></tr>" +
        "<tr> <td class='column'>预防措施：</td>" +
        "<td>" + bugEntity.prevent + "</td></tr>"

    );
    $("#modeltable").append(table_content);
}