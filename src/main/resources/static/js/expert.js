$(document).ready(function () {
    $("#mytable").bootstrapTable({
        url:"info/expert",  //请求地址
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
        }]
    })
})

function searchedTable(name,company,expertise) {
    if(name=="" && company==""&& expertise=="" ){
        resetTable()
    }else{
        $("#mytable").bootstrapTable('refresh',{
            url:"info/searchedExpert?name="+name+"&company="+company+"&expertise="+expertise,//请求地址
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
            }]
        })
    }
}


function resetTable(){
    $("#mytable").bootstrapTable("refresh",{
        url:"info/expert",  //请求地址
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
        }]
    })
}

$(function (){
    $('#add').click(function (){
        $.ajax({
            url:"manage/addExpert.action",
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


