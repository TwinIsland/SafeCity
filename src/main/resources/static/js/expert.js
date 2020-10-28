$(document).ready(function () {
    $("#mytable").bootstrapTable({
        url:"/info/expert",  //请求地址
        striped : true, //是否显示行间隔色
        pageNumber : 1, //初始化加载第一页
        pagination : true,//是否分页
        sidePagination : 'client',//server:服务器端分页|client：前端分页
        pageSize : 5,//单页记录数
        pageList : [ 5, 10],//可选择单页记录数
        showRefresh : true,//刷新按钮
        columns : [ {
            title : '姓名',
            field : 'name',
            sortable : true
        }, {
            title : '工作单位',
            field : 'company',
            sortable : true
        }, {
            title : '专长',
            field : 'expertise',
            sortable : true
        }, {
            title : '职务',
            field : 'post',
            sortable : true
        }, {
            title : '电话',
            field : 'phone',
            sortable : true
        }, {
            title : '操作',
            field : 'name',
            // events : operateEvents, //给按钮注册事件
            formatter : actionFormatter, //表格中增加按钮
        }]
    })
})

function searchedTable(name,company,expertise) {
    if(name=="" && company==""&& expertise=="" ){
        resetTable()
    }else{
        $("#mytable").bootstrapTable('refresh',{
            url:"/info/searchedExpert?name="+name+"&company="+company+"&expertise="+expertise,//请求地址
            striped : true, //是否显示行间隔色
            pageNumber : 1, //初始化加载第一页
            pagination : true,//是否分页
            sidePagination : 'client',//server:服务器端分页|client：前端分页
            pageSize : 5,//单页记录数
            pageList : [5, 10],//可选择单页记录数
            showRefresh : true,//刷新按钮
            columns : [ {
                title : '姓名',
                field : 'name',
                sortable : true
            }, {
                title : '工作单位',
                field : 'company',
                sortable : true
            }, {
                title : '专长',
                field : 'expertise',
                sortable : true
            }, {
                title : '职务',
                field : 'post',
                sortable : true
            }, {
                title : '电话',
                field : 'phone',
                sortable : true
            }, {
                title : '操作',
                field : 'name',
                // events : operateEvents, //给按钮注册事件
                formatter : actionFormatter, //表格中增加按钮
            }]
        })
    }
}


function resetTable(){
    $("#mytable").bootstrapTable("refresh",{
        url:"/info/expert",  //请求地址
        striped : true, //是否显示行间隔色
        pageNumber : 1, //初始化加载第一页
        pagination : true,//是否分页
        sidePagination : 'client',//server:服务器端分页|client：前端分页
        pageSize : 5,//单页记录数
        pageList : [5, 10],//可选择单页记录数
        //showRefresh : false,//刷新按钮
        columns : [ {
            title : '姓名',
            field : 'name',
            sortable : true
        }, {
            title : '工作单位',
            field : 'company',
            sortable : true
        }, {
            title : '专长',
            field : 'expertise',
            sortable : true
        }, {
            title : '职务',
            field : 'post',
            sortable : true
        }, {
            title : '电话',
            field : 'phone',
            sortable : true
        }, {
            title : '操作',
            field : 'name',
            // events : operateEvents, //给按钮注册事件
            formatter : actionFormatter, //表格中增加按钮
        }]
    })
}

$(function (){
    $('#add').click(function (){
        $.ajax({
            url:"/manage/addExpert.action",
            type:"POST",
            data:{
                name:$("#aname").val(),
                company:$("#acompany").val(),
                expertise:$("#aexpertise").val(),
                post:$("#apost").val(),
                phone:$("#aphone").val()
            },
            success:function (result){
                if(result === "false"){
                    alert("添加失败！")
                }else{
                    resetTable()
                }
            }
        })
    })
})

//列表行操作按钮
function actionFormatter(value,row,index) {
    var name = value;
    var result = "";
    //return '<button id="TableEditor" style="color: #0d95e8" type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal">查看详情</button>'
    result += "<a href='javascript:;' class='btn btn-xs green' onclick=\"expertName('" + name + "', view='view')\" title='查看详情' data-toggle=\"modal\" data-target=\"#myModal\">查看详情<span class='glyphicon glyphicon-hand-up'></span></a>";
    return result;
}
//根据name查看详情
function expertName(name) {
    $.ajax({
        url: "/user/findOneExpert",
        type: "post",
        data: {expertName: name},
        success: showQuery
    });
}

function showQuery(expertEntity) {
    $("#modeltable").empty();
    var table_content = $(
        "<tr><td class='column'>姓名：</td>" +
        "<td>" + expertEntity.name + "</td></tr>" +
        "<tr><td class='column'>出生年月：</td>" +
        "<td>" + expertEntity.date + "</td></tr>" +
        "<tr> <td class='column'>性别：</td>" +
        "<td>" + expertEntity.sex + "</td></tr>" +
        "<tr> <td class='column'>专长：</td>" +
        "<td>" + expertEntity.expertise + "</td></tr>" +
        "<tr> <td class='column'>职务：</td>" +
        "<td>" + expertEntity.post + "</td></tr>" +
        "<tr> <td class='column'>通讯地址：</td>" +
        "<td>" + expertEntity.addr + "</td></tr>"+
        "<tr> <td class='column'>电话：</td>" +
        "<td>" + expertEntity.phone + "</td></tr>"+
        "<tr> <td class='column'>工作单位：</td>" +
        "<td>" + expertEntity.company + "</td></tr>"+
        "<tr> <td class='column'>邮箱：</td>" +
        "<td>" + expertEntity.email + "</td></tr>"+
        "<tr> <td class='column'>照片：</td>" +
        "<td>" + expertEntity.img + "</td></tr>"
    );
    $("#modeltable").append(table_content);

}

