<%--
  Created by IntelliJ IDEA.
  User: qianfeng
  Date: 2018/12/12
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>动趣网</title>
</head>
<body>
<script type="text/javascript"  src="/js/jquery-2.1.0.js"></script>
<script type="text/javascript">

    $(function(){

        $("#btn").click(function(){
            var json = $("#myLoginForm").serializeArray();
            $.post("/doLogin",json,function(r){

                if(r.status==200){
                    //首页系统  门户系统
                    location.href="http://localhost:8089/index.html";
                }

            });
        });
    });

</script>


  <form id="myLoginForm" >
      <table>
          <tr>
              <td>用户名</td>
              <td><input type="text" name="username"> </td>
          </tr>
          <tr>
              <td>密码</td>
              <td><input type="password" name="password"> </td>
          </tr>
          <tr>

              <td cospan="2"><input id="btn" type="button" value="登录"> </td>
          </tr>
      </table>
  </form>

</body>
</html>
