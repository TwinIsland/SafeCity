$(document).ready(function () {
    $("#mytable").bootstrapTable({
        url:"info/record",  //请求地址
        striped : true, //是否显示行间隔色
        pageNumber : 1, //初始化加载第一页
        pagination : true,//是否分页
        sidePagination : 'client',//server:服务器端分页|client：前端分页
        pageSize : 5,//单页记录数
        pageList : [ 5, 10],//可选择单页记录数
        showRefresh : true,//刷新按钮
        columns : [ {
            title : '日期',
            field : 'date',
            sortable : true
        }, {
            title : '会商人员',
            field : 'person',
            sortable : true
        }, {
            title : '会商结果',
            field : 'result',
            sortable : true
        }]
    })
})

function searchedTable(date,person,result) {
    if(date=="" && person==""&& result=="" ){
        resetTable()
    }else{
        $("#mytable").bootstrapTable('refresh',{
            url:"info/searchedRecord?date="+date+"&person="+person+"&result="+result,//请求地址
            striped : true, //是否显示行间隔色
            pageNumber : 1, //初始化加载第一页
            pagination : true,//是否分页
            sidePagination : 'client',//server:服务器端分页|client：前端分页
            pageSize : 5,//单页记录数
            pageList : [5, 10],//可选择单页记录数
            showRefresh : true,//刷新按钮
            columns : [ {
                title : '日期',
                field : 'date',
                sortable : true
            }, {
                title : '会商人员',
                field : 'person',
                sortable : true
            }, {
                title : '会商结果',
                field : 'result',
                sortable : true
            }]
        })
    }
}

function resetTable(){
    $("#mytable").bootstrapTable("refresh",{
        url:"info/record",  //请求地址
        striped : true, //是否显示行间隔色
        pageNumber : 1, //初始化加载第一页
        pagination : true,//是否分页
        sidePagination : 'client',//server:服务器端分页|client：前端分页
        pageSize : 5,//单页记录数
        pageList : [5, 10],//可选择单页记录数
        //showRefresh : false,//刷新按钮
        columns : [ {
            title : '日期',
            field : 'date',
            sortable : true
        }, {
            title : '会商人员',
            field : 'person',
            sortable : true
        }, {
            title : '会商结果',
            field : 'result',
            sortable : true
        }]
    })
}

$(function (){
    $('#add').click(function (){
        $.ajax({
            url:"manage/addRecord.action",
            type:"POST",
            data:{
                date:$("#date").val(),
                person:$("#person").val(),
                result:$("#result").val(),

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
