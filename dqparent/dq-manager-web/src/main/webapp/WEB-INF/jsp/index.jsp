<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

	<style>
		ul{display: inline-block;width: 100%;margin: 0;padding: 0;}
		li{list-style-type: none;margin: 5px;padding: 0;}
	</style>
<!-- easyui -->
<link rel="stylesheet" href="js/jquery-easyui-1.5/themes/bootstrap/easyui.css">
<link rel="stylesheet" href="js/jquery-easyui-1.5/themes/icon.css">

</head>
<body class="easyui-layout">   
	<div data-options="region:'north'" style="height:70px;padding-left:10px; background-color: #082736; color: #fff;">
		<h1>动趣网后台管理系统</h1>
	</div>
	<div data-options="region:'south'" style="padding:5px;background:#eee;">
		系统版本：V2.0 by alit
	</div>   
	<div data-options="region:'west'" style="width:200px;">

		<div id="menu" class="easyui-accordion" >   
		    <div title="场地管理" data-options="selected:true" style="padding:10px 0;">   
	         	<ul class="easyui-tree"><!--zTree-->
	         		<li data-options="attributes:{'href':'item-add'}">新增场地</li>
	         		<li data-options="attributes:{'href':'item-list'}">查询场地</li>
	         		
	         	</ul>
		    </div>   
		    <div title="网站内容管理" style="padding:10px 0;">   
		        <ul class="easyui-tree">
	         		<li data-options="attributes:{'href':'content-category'}">内容分类管理</li>
	         		<li data-options="attributes:{'href':'content'}">内容管理</li>
	         	</ul>
		    </div>   
		</div> 
	</div>     
	<div data-options="region:'center'" style="background:#eee;">
		<div id="tab" class="easyui-tabs" data-options="fit:true">   
		    <div title="欢迎页面" style="padding:20px;">动趣网</div>     
		</div>  
	</div>   



<!-- jquery -->
<script src="js/jquery-easyui-1.5/jquery.min.js"></script>
<!-- jquery easyui -->
<script src="js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script src="js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>

	<!-- 配置文件  注意顺序 -->
	<script type="text/javascript" src="js/ueditor/ueditor.config.js"></script>
	<!-- 编辑器源码文件 -->
	<script type="text/javascript" src="js/ueditor/ueditor.all.js"></script>
	<!-- 实例化编辑器 -->

<!-- 自定义脚本 -->
<script src="js/common.js"></script>

<!-- 自定义js -->
<script>

ttshop.registerMenuEvent();

</script>
</body>
</html>