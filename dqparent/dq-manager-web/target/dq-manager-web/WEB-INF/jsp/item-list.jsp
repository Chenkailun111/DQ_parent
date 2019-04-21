<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="tb">
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit',plain:true">编辑</a>
    <button onclick="deleteGrounds()" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true">删除</button>
    <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true">新增</a>
</div>

<table id="dg"></table>
<script type="text/javascript">
    $(function(){
        $('#dg').datagrid({
           // url:'/findAll',
            url:"/findGrounds",
            toolbar:"#tb",
            pagination:true,//page:2  rows:10
            fit:true,//当设置为true的时候面板大小将自适应父容器
            columns:[[
                {checkbox:true,title:'ck',field:'c'},
                {field:'id',title:'编号',width:100},
                {field:'name',title:'场地名称',width:100},
                {field:'createdAt',title:'创建时间',width:100,align:'right'},
                {field:'createdExt',title:'创建时间',width:100,align:'right'},
                {field:'updatedExt',title:'修改时间',width:100,align:'right'}
            ]]
        });
    });

    function deleteGrounds() {
       if (confirm("确定删除吗？")){
           var rows = $("#dg").datagrid("getSelections");//得到用户选择的记录，（哪些框被选中） 返回时数组
           console.log(rows);
           var ids = "";
           for (var i=0;i<rows.length;i++){
               var id =  rows[i].id;
              // ids.push(id);
               if (i>0){
                   ids+="&";
               }
               //ids=0&ids=1&ids=2...遍历的结果
               ids+="ids="+id;
           }
           //ids="ids=1&ids=2"undefined的是图片属性
           console.log(ids.toString());
           $.get("/deleteGrounds",ids,function(r){
               if (r.status==200){
                   //删除成功！
                   $.messager.alert("提示","删除场地成功",undefined,function(){
                       //刷新页面
                       $("#dg").datagrid("reload");
                   });
               }
           });
       }
    }
</script>
