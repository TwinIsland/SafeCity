$(document).ready(function () {
    $("#mytable").bootstrapTable({
        url: "info/takelist",  //请求地址
        striped: true, //是否显示行间隔色
        pageNumber: 1, //初始化加载第一页
        pagination: true,//是否分页
        sidePagination: 'client',//server:服务器端分页|client：前端分页
        pageSize: 5,//单页记录数
        pageList: [5, 10],//可选择单页记录数
        showRefresh: true,//刷新按钮
        columns: [{
            title: '日期',
            field: 'date',
            sortable: true
        }, {
            title: '领用小班',
            field: 'team',
            sortable: true
        }, {
            title: '出库人',
            field: 'name',
            sortable: true
        }, {
            title: '操作',
            field: 'id',
            //events : operateEvents, //给按钮注册事件
            formatter: actionFormatter, //表格中增加按钮
        }]
    })
})

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
        url: "info/takelistById.action",
        type: "post",
        data: {
            id: id
        },
        success: showQuery
    });
}

function showQuery(takeListEntity) {
    $("#modeltable").empty();
    var table_content = $(
        "<tr><td class='column'>ID：</td>" +
        "<td>" + takeListEntity.id + "</td></tr>" +
        "<tr><td class='column'>日期：</td>" +
        "<td>" + takeListEntity.date + "</td></tr>" +
        "<tr> <td class='column'>出库人：</td>" +
        "<td>" + takeListEntity.name + "</td></tr>" +
        "<tr> <td class='column'>领用小队：</td>" +
        "<td>" + takeListEntity.team + "</td></tr>" +
        "<tr> <td class='column'>领用数量：</td>" +
        "<td>" + takeListEntity.count + "</td></tr>" +
        "<tr> <td class='column'>领用药品：</td>" +
        "<td>" + takeListEntity.medName + "</td>" +
        "<tr> <td class='column'>药品类型：</td>" +
        "<td>" + takeListEntity.medType + "</td>" +
        "<tr> <td class='column'>药品防止：</td>" +
        "<td>" + takeListEntity.medPType + "</td>" +
        "</tr>"
    );
    $("#modeltable").append(table_content);
}

function searchedTable(sDate, eDate, name) {

    if (sDate === "" && eDate === "" && name === "") {
        resetTable()
    } else {
        $("#mytable").bootstrapTable("refresh", {
            url: "info/searchedTakeList.action?sDate=" + sDate + "&eDate=" + eDate + "&name=" + name,  //请求地址
            striped: true, //是否显示行间隔色
            pageNumber: 1, //初始化加载第一页
            pagination: true,//是否分页
            sidePagination: 'client',//server:服务器端分页|client：前端分页
            pageSize: 5,//单页记录数
            pageList: [5, 10],//可选择单页记录数
            showRefresh: true,//刷新按钮
            columns: [{
                title: '日期',
                field: 'date',
                sortable: true
            }, {
                title: '领用小班',
                field: 'team',
                sortable: true
            }, {
                title: '出库人',
                field: 'name',
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
        url: "info/takelist",  //请求地址
        striped: true, //是否显示行间隔色
        pageNumber: 1, //初始化加载第一页
        pagination: true,//是否分页
        sidePagination: 'client',//server:服务器端分页|client：前端分页
        pageSize: 5,//单页记录数
        pageList: [5, 10],//可选择单页记录数
        showRefresh: true,//刷新按钮
        columns: [{
            title: '日期',
            field: 'date',
            sortable: true
        }, {
            title: '领用小班',
            field: 'team',
            sortable: true
        }, {
            title: '出库人',
            field: 'name',
            sortable: true
        }, {
            title: '操作',
            field: 'id',
            //events : operateEvents, //给按钮注册事件
            formatter: actionFormatter, //表格中增加按钮
        }]
    })
}