$(document).ready(function () {
    $("#mytable").bootstrapTable({
        url:"/user/mouse",  //请求地址
        striped : true, //是否显示行间隔色
        pageNumber : 1, //初始化加载第一页
        pagination : true,//是否分页
        sidePagination : 'client',//server:服务器端分页|client：前端分页
        pageSize : 5,//单页记录数
        pageList : [ 5, 10],//可选择单页记录数
        showRefresh : true,//刷新按钮
        columns : [ {
            title : '鼠名',
            field : 'name',
            sortable : true
        }, {
            title : '食物',
            field : 'food',
            sortable : true
        }, {
            title : '主要危害',
            field : 'damage',
            sortable : true
        }, {
            title : '操作',
            field : 'name',
            formatter : actionFormatter, //表格中增加按钮
        }]
    })
})

function searchedTable(name){
    if(name===""){
        resetTable()
    }else{
        $("#mytable").bootstrapTable('refresh',{
            url:"/info/searchedMouse?name=" + name,  //请求地址
            striped : true, //是否显示行间隔色
            pageNumber : 1, //初始化加载第一页
            pagination : true,//是否分页
            sidePagination : 'client',//server:服务器端分页|client：前端分页
            pageSize : 5,//单页记录数
            pageList : [5, 10],//可选择单页记录数
            showRefresh : true,//刷新按钮

            columns : [ {
                title : '鼠名',
                field : 'name',
                sortable : true
            }, {
                title : '食物',
                field : 'food',
                sortable : true
            }, {
                title : '主要危害',
                field : 'damage',
                sortable : true
            }, {
                title : '操作',
                field : 'name',
                formatter : actionFormatter, //表格中增加按钮
            }]
        })
    }
}

function resetTable(){
    $("#mytable").bootstrapTable("refresh",{
        url:"/user/mouse",  //请求地址
        striped : true, //是否显示行间隔色
        pageNumber : 1, //初始化加载第一页
        pagination : true,//是否分页
        sidePagination : 'client',//server:服务器端分页|client：前端分页
        pageSize : 5,//单页记录数
        pageList : [5, 10],//可选择单页记录数
        //showRefresh : false,//刷新按钮

        columns : [ {
            title : '鼠名',
            field : 'name',
            sortable : true
        }, {
            title : '食物',
            field : 'food',
            sortable : true
        }, {
            title : '主要危害',
            field : 'damage',
            sortable : true
        }, {
            title : '操作',
            field : 'name',
            formatter : actionFormatter, //表格中增加按钮
        }]
    })
}

//列表行操作按钮
function actionFormatter(value,row,index){
    var name = value;
    var result = "";
    //return '<button id="TableEditor" style="color: #0d95e8" type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal">查看详情</button>'
    result += "<a href='javascript:;' class='btn btn-xs green' onclick=\"mouseName('" + name + "', view='view')\" title='查看详情' data-toggle=\"modal\" data-target=\"#myModal\">查看详情<span class='glyphicon glyphicon-hand-up'></span></a>";
    return result;
}

//根据name查看详情
function mouseName(name) {
    $.ajax({
        url:"/user/findMouse",
        type:"post",
        data:{mouseName:name},
        success:showQuery
    });
}
