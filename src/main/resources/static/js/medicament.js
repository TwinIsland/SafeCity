$(function () {
    $("#mytable").bootstrapTable({
        url: "info/medication",  //请求地址
        striped: true, //是否显示行间隔色
        pageNumber: 1, //初始化加载第一页
        pagination: true,//是否分页
        sidePagination: 'client',//server:服务器端分页|client：前端分页
        pageSize: 5,//单页记录数
        pageList: [5, 10],//可选择单页记录数
        showRefresh: true,//刷新按钮

        columns: [{
            title: 'ID',
            field: 'med_id',
            sortable: true
        }, {
            title: '名称',
            field: 'med_name',
            sortable: true
        }, {
            title: '防治类型',
            field: 'med_ptype',
            sortable: true
        }, {
            title: '种类',
            field: 'med_type',
            sortable: true
        }, {
            title: '作用',
            field: 'med_purpose',
            sortable: true
        }, {
            title: '数量',
            field: 'med_count',
            sortable: true
        }]
    })
})

function searchedTable(name, pType, type) {

    $("#mytable").bootstrapTable('refresh', {
        url: "info/searchedMedication.action?name=" + name + "&pType=" + pType + "&type=" + type,  //请求地址
        striped: true, //是否显示行间隔色
        pageNumber: 1, //初始化加载第一页
        pagination: true,//是否分页
        sidePagination: 'client',//server:服务器端分页|client：前端分页
        pageSize: 5,//单页记录数
        pageList: [5, 10],//可选择单页记录数
        showRefresh: true,//刷新按钮


        columns: [{
            title: 'ID',
            field: 'med_id',
            sortable: true
        }, {
            title: '名称',
            field: 'med_name',
            sortable: true
        }, {
            title: '防治类型',
            field: 'med_ptype',
            sortable: true
        }, {
            title: '种类',
            field: 'med_type',
            sortable: true
        }, {
            title: '作用',
            field: 'med_purpose',
            sortable: true
        }, {
            title: '数量',
            field: 'med_count',
            sortable: true
        }]
    })

}

function resetTable() {
    $("#mytable").bootstrapTable("refresh", {
        url: "info/medication",  //请求地址
        striped: true, //是否显示行间隔色
        pageNumber: 1, //初始化加载第一页
        pagination: true,//是否分页
        sidePagination: 'client',//server:服务器端分页|client：前端分页
        pageSize: 5,//单页记录数
        pageList: [5, 10],//可选择单页记录数
        //showRefresh : false,//刷新按钮


        columns: [{
            title: 'ID',
            field: 'med_id',
            sortable: true
        }, {
            title: '名称',
            field: 'med_name',
            sortable: true
        }, {
            title: '防治类型',
            field: 'med_ptype',
            sortable: true
        }, {
            title: '种类',
            field: 'med_type',
            sortable: true
        }, {
            title: '作用',
            field: 'med_purpose',
            sortable: true
        }, {
            title: '数量',
            field: 'med_count',
            sortable: true
        }]
    })
}