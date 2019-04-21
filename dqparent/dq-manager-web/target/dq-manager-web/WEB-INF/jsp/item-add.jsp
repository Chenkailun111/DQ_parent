<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
    $(function(){
        /***
         * combobox
         * combotree
         */
        $("#depotEntryId").combotree({
            url:"/selectEntityType"
        });
});

    //避免第二次加载不出来的问题
    UE.delEditor("container");
    //实例化富文本编辑器
    var ue = UE.getEditor('container',
        {
            initialFrameWidth:'100%',
            initialFrameHeight:'400',
            serverUrl:"/server/fileUpload"//服务端请求地址   默认请求controller.jsp页面
        });

    UE.delEditor("uploadEditor");
    var uploadEditor = UE.getEditor("uploadEditor", {
        serverUrl:"/server/fileUpload",
        scaleEnabled:true,
        toolbars: [["insertimage", "attachment"]]
    });

    //2、监听多图上传和上传附件组件的插入动作
    uploadEditor.ready(function () {
        // 监听插入图片
        uploadEditor.addListener("beforeInsertImage", _beforeInsertImage);
    });

    //我们对id="j_upload_img_btn"的 button绑定触发ue多图上传对话框的事件，这样我们才能够操作ue。

document.getElementById('j_upload_img_btn').onclick = function () {
    var dialog = uploadEditor.getDialog("insertimage");
    dialog.title = '多图上传';
    dialog.render();
    dialog.open();
};

//多图上传的核心在于“beforeInsertImage”动作，此动作返回已选图片的信息集合。
function _beforeInsertImage(t, result) {
    var imageHtml = '';
    var imgs = new Array();
    for(var i in result){
        imgs.push(result[i].src);
        console.log(result[i].src);//图片的访问地址
        imageHtml += '<li><img src="'+result[i].src+'" alt="'+result[i].alt+'" height="150"></li>';
    }
    //
    $("#myImages").val(imgs.toString());//"aaa.jpg,bbb.jpg"
    document.getElementById('upload_img_wrap').innerHTML = imageHtml;
}



    function addGrounds(){
        // call 'submit' method of form plugin to submit the form
      /*  $('#ff').form('submit', {
            url:"/addGrounds",
            onsubmit: function(){
                // do some check
                var isValid = $(this).form('validate');
                console.log("isValid"+isValid);
                // return false to prevent submit;
                return isValid;
            },
            success:function(data){
                //// change the JSON string to javascript object
                //data
               console.log("data:--"+data);
               var json = JSON.parse(data);
                if (json.status==200){
                    $('#tab').tabs('close', 1);
                    $('#tab').tabs('add',{
                        title: "查询场地",
                        href: "item-list",//选项卡展示的页面
                        closable: true
                    });
                }

            }
        });
*/
     //jquery
      var json = $("#ff").serializeArray();//得到表单的所有值  返回json数组
      $.get("/addGrounds",json,function(r){
          alert(r);
          console.log(r);
          if (r.status==200) {
              $('#tab').tabs('close', 1);
              $('#tab').tabs('add', {
                  title: "查询场地",
                  href: "item-list",//选项卡展示的页面
                  closable: true
              });

          }
    });
        return false;
    }
</script>

<form id="ff" method="post" >
    <div>
        <label for="depotEntryId">类    型</label>
        <input  id="depotEntryId" type="text" name="depotEntryId" data-options="required:true" />
    </div>
    <div>
        <label for="name"> 场地名称:</label><!--data-options="validType:'email'" 校验字段的类型为邮箱-->
        <input class="easyui-validatebox" id="name" type="text" name="name" data-options="required:true" />
    </div>

    <!-- 单独使用uedtiro图片上传的功能
    http://www.dookay.com/n/10929
    -->
    <div>
    <button type="button" id="j_upload_img_btn">多图上传</button>
    <ul id="upload_img_wrap"></ul>
    <!-- 加载编辑器的容器  隐藏的 -->
    <textarea id="uploadEditor" style="display: none;"></textarea>

     <!-- 存放图片地址的隐藏表单域 -->
        <input type="hidden" name="images" id="myImages">
  </div>
    <div>
        <label for="name"> 场地描述:</label>
    <!-- 加载编辑器的容器 -->
    <script id="container" name="description" type="text/plain">
        这里写你的初始化内容
    </script>
    <!-- 配置文件 -->
   </div>
    <div>
        <a onclick="addGrounds()" id="btn"  class="easyui-linkbutton"
                data-options="iconCls:'icon-ok'">保存</a>

    </div>
</form>

