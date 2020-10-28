$(document).ready(function () {
    $("#mytable").bootstrapTable({
        url: "info/team",  //请求地址
        striped: true, //是否显示行间隔色
        pageNumber: 1, //初始化加载第一页
        pagination: true,//是否分页
        sidePagination: 'client',//server:服务器端分页|client：前端分页
        pageSize: 5,//单页记录数
        pageList: [5, 10],//可选择单页记录数
        showRefresh: true,//刷新按钮
        columns: [{
            title: '小班名称',
            field: 'team',
            sortable: true
        }, {
            title: '负责人',
            field: 'name',
            sortable: true
        }, {
            title: '负责人电话',
            field: 'tel',
            sortable: true
        }, {
            title: '负责区域',
            field: 'zone',
            sortable: true
        }, {
            title: '操作',
            field: 'id',
            //events : operateEvents, //给按钮注册事件
            formatter: actionFormatter, //表格中增加按钮
        }]
    })
})

function searchedTable(team, zone) {
    if (team === "" && zone === "") {
        resetTable()
    } else {
        $("#mytable").bootstrapTable('refresh', {
            url: "info/searchedTeam?team=" + team + "&area=" + zone,  //请求地址
            striped: true, //是否显示行间隔色
            pageNumber: 1, //初始化加载第一页
            pagination: true,//是否分页
            sidePagination: 'client',//server:服务器端分页|client：前端分页
            pageSize: 5,//单页记录数
            pageList: [5, 10],//可选择单页记录数
            showRefresh: true,//刷新按钮

            columns: [{
                title: '小班名称',
                field: 'team',
                sortable: true
            }, {
                title: '负责人',
                field: 'name',
                sortable: true
            }, {
                title: '负责人电话',
                field: 'tel',
                sortable: true
            }, {
                title: '负责区域',
                field: 'zone',
                sortable: true
            }, {
                title: '操作',
                field: 'id',
                //events : operateEvents, //给按钮注册事件
                formatter: actionFormatter, //表格中增加按钮
            }]
        })
    }
}

function resetTable() {
    $("#mytable").bootstrapTable("refresh", {
        url: "info/team",  //请求地址
        striped: true, //是否显示行间隔色
        pageNumber: 1, //初始化加载第一页
        pagination: true,//是否分页
        sidePagination: 'client',//server:服务器端分页|client：前端分页
        pageSize: 5,//单页记录数
        pageList: [5, 10],//可选择单页记录数
        //showRefresh : false,//刷新按钮

        columns: [{
            title: '小班名称',
            field: 'team',
            sortable: true
        }, {
            title: '负责人',
            field: 'name',
            sortable: true
        }, {
            title: '负责人电话',
            field: 'tel',
            sortable: true
        }, {
            title: '负责区域',
            field: 'zone',
            sortable: true
        }, {
            title: '操作',
            field: 'id',
            //events : operateEvents, //给按钮注册事件
            formatter: actionFormatter, //表格中增加按钮
        }]
    })
}

//列表行操作按钮
function actionFormatter(value) {
    var result = "";
    //return '<button id="TableEditor" style="color: #0d95e8" type="button" class="btn btn-default" data-toggle="modal" data-target="#myModal">查看详情</button>'
    result += "<a href='javascript:;' class='btn btn-xs green' onclick=\"takelistInfo('" + value + "', view='view')\" title='查看详情' data-toggle=\"modal\" data-target=\"#myModal\">查看详情<span class='glyphicon glyphicon-hand-up'></span></a>";
    return result;
}

//根据name查看详情
function takelistInfo(id) {
    $.ajax({
        url: "info/getTeamById.action",
        type: "post",
        data: {
            id: id
        },
        success: showQuery
    });
}

function showQuery(teamEntity) {
    $("#modeltable").empty();
    var table_content = $(
        "<tr><td class='column'>ID：</td>" +
        "<td>" + teamEntity.id + "</td></tr>" +
        "<tr><td class='column'>负责人：</td>" +
        "<td>" + teamEntity.name + "</td></tr>" +
        "<tr> <td class='column'>区域：</td>" +
        "<td>" + teamEntity.zone + "</td></tr>" +
        "<tr> <td class='column'>地形：</td>" +
        "<td>" + teamEntity.ltype + "</td></tr>" +
        "<tr> <td class='column'>林种：</td>" +
        "<td>" + teamEntity.ftype + "</td></tr>" +
        "<tr> <td class='column'>优势树种：</td>" +
        "<td>" + teamEntity.tree + "</td></tr>" +
        "<tr> <td class='column'>人数：</td>" +
        "<td>" + teamEntity.num + "</td></tr>" +
        "<tr> <td class='column'>负责人电话：</td>" +
        "<td>" + teamEntity.tel + "</td></tr>" +
        "<tr> <td class='column'>日期：</td>" +
        "<td>" + teamEntity.date + "</td></tr>" +
        "<tr> <td class='column'>小队：</td>" +
        "<td>" + teamEntity.team + "</td></tr>"
    );
    $("#modeltable").append(table_content);
}
