$(function (){
    $("#mytable").bootstrapTable({
        url:"info/log",  //请求地址
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
            title : '日志内容',
            field : 'content',
            sortable : true
        }, {
            title : '日期',
            field : 'date',
            sortable : true
        }]
    })
})

function searchedTable(sD,eD){
    if(sD==="" && eD===""){
        resetTable()
    }else{
    $("#mytable").bootstrapTable('refresh',{
        url:"info/newLog?sDate="+sD + "&eDate=" + eD,  //请求地址
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
            title : '日志内容',
            field : 'content',
            sortable : true
        }, {
            title : '日期',
            field : 'date',
            sortable : true
        }]
    })
    }
}

function resetTable(){
    $("#mytable").bootstrapTable("refresh",{
        url:"info/log",  //请求地址
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
            title : '日志内容',
            field : 'content',
            sortable : true
        }, {
            title : '日期',
            field : 'date',
            sortable : true
        }]
    })
}