$(function (){
    $("#mytable").bootstrapTable({
        url:"info/zone",  //请求地址
        striped : true, //是否显示行间隔色
        pageNumber : 1, //初始化加载第一页
        pagination : true,//是否分页
        sidePagination : 'client',//server:服务器端分页|client：前端分页
        pageSize : 5,//单页记录数
        pageList : [5, 10],//可选择单页记录数
        showRefresh : true,//刷新按钮

        columns : [ {
            title : '区域',
            field : 'area',
            sortable : true
        }, {
            title : '林种',
            field : 'forest',
            sortable : true
        }, {
            title : '地类',
            field : 'land',
            sortable : true
        }, {
            title : '优势树种',
            field : 'tree',
            sortable : true
        }, {
            title : '负责小班',
            field : 'team',
            sortable : true
        }]
    })
})

function searchedTable(area,forest,team){
    if(area==="" && forest==="" && team===""){
        resetTable()
    }else{
        $("#mytable").bootstrapTable('refresh',{
            url:"info/searchedZone?area=" + area + "&forest=" + forest + "&team=" + team,  //请求地址
            striped : true, //是否显示行间隔色
            pageNumber : 1, //初始化加载第一页
            pagination : true,//是否分页
            sidePagination : 'client',//server:服务器端分页|client：前端分页
            pageSize : 5,//单页记录数
            pageList : [5, 10],//可选择单页记录数
            showRefresh : true,//刷新按钮

            columns : [ {
                title : '区域',
                field : 'area',
                sortable : true
            }, {
                title : '林种',
                field : 'forest',
                sortable : true
            }, {
                title : '地类',
                field : 'land',
                sortable : true
            }, {
                title : '优势树种',
                field : 'tree',
                sortable : true
            }, {
                title : '负责小班',
                field : 'team',
                sortable : true
            }]
        })
    }
}

function resetTable(){
    $("#mytable").bootstrapTable("refresh",{
        url:"info/zone",  //请求地址
        striped : true, //是否显示行间隔色
        pageNumber : 1, //初始化加载第一页
        pagination : true,//是否分页
        sidePagination : 'client',//server:服务器端分页|client：前端分页
        pageSize : 5,//单页记录数
        pageList : [5, 10],//可选择单页记录数
        //showRefresh : false,//刷新按钮

        columns : [ {
            title : '区域',
            field : 'area',
            sortable : true
        }, {
            title : '林种',
            field : 'forest',
            sortable : true
        }, {
            title : '地类',
            field : 'land',
            sortable : true
        }, {
            title : '优势树种',
            field : 'tree',
            sortable : true
        }, {
            title : '负责小班',
            field : 'team',
            sortable : true
        }]
    })
}