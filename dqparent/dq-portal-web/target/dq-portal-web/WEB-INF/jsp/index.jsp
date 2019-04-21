<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="../../css/style.css" rel="stylesheet" type="text/css" />
<link href="../../css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" language="javascript">
function switchTab(tabid,tab,num)
{
	var tabs = num+1;
	for(var i=1;i<tabs;i++)
	{
	    var x = document.getElementById(tab+i);
	    x.className = "";
	}
    document.getElementById(tabid).className = "on";
    
	for (var i=0;i<num;i++)
	{	  
	  var dvs=document.getElementById('Cont'+tab+(i+1));
	  dvs.style.display='none';
	  if ((tab+(i+1))==(tabid))
	    dvs.style.display='';
  	  
     }
}

</script>
<script type="text/javascript" language="javascript">
    function $(id)
    {
    if(document.getElementById(id))
     return document.getElementById(id);
    }
    function showSearchSort()
    {
	    $("SearchSort").style.display= "block";
    }
    
    function hiddenSearchSort() 
    {		
	    $("SearchSort").style.display = "none";		
    }
    
    function SetAction(action)
    {      	
        //alert(action.length);	
        $("selaction").innerText = action;
        $("SearchSort").style.display = "none";		
		//alert( $("selaction").innerText );
        //$("selaction").innerHTML = action;
    }	
</script>

<script src="../../js/jquery-2.1.0.js"></script>
<script src="../../js/jquery.cookie.js"></script>
<script type="text/javascript">
	console.log("---->准备走ajax");
   /* $(function(){
        $.ajax({
			url:'http://localhost:8082/login',
			data:{username:'admin',password:'admin'},
			dataType:"jsonp",//jsonp方式跨域  1）传递参数：callback， 2）响应回来的数据不能是json  ，而是js代码
			success:function(r){//该请求响应回来的js函数就是success函数
			     console.log(r);
			}

		});

	});*/

    $(document).ready(function(){
        // 查看是否已经登录，如果已经登录查询登录信息
		//js访问cookie
		//jquery.cookie.js
        var _ticket = $.cookie("DQ_LOGIN_TOKEN");
        if(!_ticket){
            return ;
        }
        $.ajax({
            url : "http://localhost:8082/checkToken/" + _ticket,//多一个callback参数  服务端和需要响应js代码
            dataType : "jsonp",
            type : "GET",
            success : function(data){
                var html="";
				if (data.status==200){//登录了
				    console.log(data.data);//console  alert
				    var userJson = JSON.parse(data.data);
					html=userJson.name+",欢迎您！";
                    $("#LoginDiv").html(html);
				} else{	//过期了
					console.log('登录过期了');
				}


            }
        });
    });
</script>
</head>

<body>
<div class="header">
	<div class="logo"><img src="../../images/logo.gif" /></div>
	<div class="city">[<a href="#">北京站</a>]<a href="#">切换</a></div>
	<div class="tools">
		<cite></cite>
		<span>
			<div id="LoginDiv">
				<a href="">登录</a> │<a href="">注册</a>
			</div>
			<a href="#">我的动趣</a> │ <a href="#">帮助</a> │ <a href="#">客服专区</a> │ <a href="#">退出</a></span>
		<em></em>
	</div>
	<div id="qfloginsms"></div>
	<div class="nav"><a href="#" class="on">首页</a><a href="#">活动</a><a href="#">比赛</a><a href="#">社团</a><a href="#">场馆</a><a href="#">培训</a><a href="#">项目</a><span><a href="#">我的动趣</a></span></div>
</div>



<div class="main">
	<div class="main_left">
		<div class="focus">
  			<embed src="../../js/dongl.swf" quality="high" pluginspage="http://www.macromedia.com/go/getflashplayer" type="application/x-shockwave-flash" width="655" height="230" wmode="transparent"></embed>
			<dl>
				<font>
					<strong>热门搜索</strong>
					<a href="#">红人</a> │ <a href="#">场馆</a> │ <a href="#">羽毛球</a> │ <a href="#">比赛</a> │ <a href="#">红人</a> ...
				</font>
				<em>
					<span id="selaction" onmouseover="showSearchSort();" onmouseout="hiddenSearchSort()">活动</span>
					<cite>
						<input name="" type="text" />
					</cite>
					<input name="" type="image" src="../../images/search.gif" />
				</em>
				<div id="SearchSort" onmouseover="showSearchSort();" onmouseout="hiddenSearchSort()">
					<p onclick="SetAction('比赛');">比赛</p>
          				<p onclick="SetAction('社团');">社团</p>
					<p><a onclick="SetAction('场馆');" href="#">场馆</a></p>
					<p onclick="SetAction('课程');">课程</p>
					<p onclick="SetAction('会员');">会员</p>
				</div>
			</dl>
	  </div>
		<div class="item">
			<h3>最受欢迎体育项目</h3>
			<ul>
				<li><a href="#"><img src="../../images/img11.jpg" /></a><span>有 <font>10000</font> 人喜欢</span></li>
				<li><a href="#"><img src="../../images/img12.jpg" /></a><span>有 <font>10000</font> 人喜欢</span></li>
				<li><a href="#"><img src="../../images/img13.jpg" /></a><span>有 <font>10000</font> 人喜欢</span></li>
				<li><a href="#"><img src="../../images/img14.jpg" /></a><span>有 <font>10000</font> 人喜欢</span></li>
				<li><a href="#"><img src="../../images/img15.jpg" /></a><span>有 <font>10000</font> 人喜欢</span></li>
				<li><a href="#"><img src="../../images/img16.jpg" /></a><span>有 <font>10000</font> 人喜欢</span></li>
				<li><a href="#"><img src="../../images/img17.jpg" /></a><span>有 <font>10000</font> 人喜欢</span></li>
				<li><a href="#"><img src="../../images/img18.jpg" /></a><span>有 <font>10000</font> 人喜欢</span></li>
			</ul>
			<div class="clear"></div>
			<h4>最新体育项目</h4>
			<ol>
				<h5><a href="#" class="on" id="tab11" onmouseover="switchTab('tab11','tab1',8)">橄榄球</a>
					<a href="#" id="tab12" onmouseover="switchTab('tab12','tab1',8)">橄榄球</a>
					<a href="#" id="tab13" onmouseover="switchTab('tab13','tab1',8)">橄榄球</a>
					<a href="#" id="tab14" onmouseover="switchTab('tab14','tab1',8)">橄榄球</a>
					<a href="#" id="tab15" onmouseover="switchTab('tab15','tab1',8)">橄榄球</a>
					<a href="#" id="tab16" onmouseover="switchTab('tab16','tab1',8)">橄榄球</a>
					<a href="#" id="tab17" onmouseover="switchTab('tab17','tab1',8)">橄榄球</a>
					<a href="#" id="tab18" onmouseover="switchTab('tab18','tab1',8)">橄榄球</a>
				</h5>
				<p id="Conttab11" style="display:block">
					<span>橄榄球(Rugby football)起源于英国，原名为拉格比足球（Rugby football）。因为其球形很像橄榄，在中国即被称为“橄榄球”，拉格比（Rugby）其实是一个英格兰小镇的名字，在这个小镇上有一间叫Rugby School的公学，那是橄榄球运动的诞生地。</span>
					<em><a href="#">去动趣橄榄球&gt;&gt;</a></em>
				</p>
				<p id="Conttab12" style="display:none">
					<span>橄榄球(Rugby football)起源于英国，原名为拉格比足球（Rugby football）。因为其球形很像橄榄，在中国即被称为</span>
					<em><a href="#">去动趣橄榄球&gt;&gt;</a></em>
				</p>
				<p id="Conttab13" style="display:none">
					<span>橄榄球(Rugby football)起源于英国，原名为拉格比足球（Rugby football）。因为其球形很像橄榄，在中国即被称为“橄榄球”，拉格比（Rugby）其实是一个英格兰小镇的名字，在这个小镇上有一间叫Rugby School的公学，那是橄榄球运动的诞生地。</span>
					<em><a href="#">去动趣橄榄球&gt;&gt;</a></em>
				</p>
				<p id="Conttab14" style="display:none">
					<span>橄榄球(Rugby football)起源于英国，原名为拉格比足球（Rugby football）。因为其球形很像橄榄，在中国即被称为“橄榄球”，拉格比</span>
					<em><a href="#">去动趣橄榄球&gt;&gt;</a></em>
				</p>
				<p id="Conttab15" style="display:none">
					<span>橄榄球(Rugby football)起源于英国，原名为拉格比足球（Rugby football）。因为其球形很像橄榄，在中国即被称为“橄榄球”，拉格比（Rugby）其实是一个英格兰小镇的名字，在这个小镇上有一间叫Rugby School的公学，那是橄榄球运动的诞生地。</span>
					<em><a href="#">去动趣橄榄球&gt;&gt;</a></em>
				</p>
				<p id="Conttab16" style="display:none">
					<span>橄榄球(Rugby football)起源于英国，原名为拉格比足球（Rugby football）。因为其球形很像橄榄，在中国即被称</span>
					<em><a href="#">去动趣橄榄球&gt;&gt;</a></em>
				</p>
				<p id="Conttab17" style="display:none">
					<span>橄榄球(Rugby football)起源于英国，原名为拉格比足球（Rugby football）。因为其球形很像橄榄，在中国即被称为“橄榄球”，拉格比（Rugby）其实是一个英格兰小镇的名字，在这个小镇上有一间叫Rugby School的公学，那是橄榄球运动的诞生地。</span>
					<em><a href="#">去动趣橄榄球&gt;&gt;</a></em>
				</p>
				<p id="Conttab18" style="display:none">
					<span>橄榄球(Rugby football)起源于英国，原名为拉格比足球（Rugby football）。因为其球形很像橄榄，在中国即被称为“橄榄球”，拉格比（Rugby）其实是一个英格兰小镇的名字</span>
					<em><a href="#">去动趣橄榄球&gt;&gt;</a></em>
				</p>
			</ol>
		</div>
		<div class="news">
			<h4>最新动态</h4>
			<ul>
				<li><a href="#">歪歪</a> 评论了 <a href="#">歪歪</a> 的相片</li>
				<li><a href="#">歪歪</a> 加入了圈子 <a href="#">足球圈</a> 的活动 <a href="#">足球比赛</a></li>
				<li><a href="#">歪歪</a> 评论了 <a href="#">歪歪</a> 的相片</li>
				<li><a href="#">歪歪</a> 加入了圈子 <a href="#">足球圈</a> 的活动 <a href="#">足球比赛</a></li>
				<li><a href="#">歪歪</a> 评论了 <a href="#">歪歪</a> 的相片</li>
				<li><a href="#">歪歪</a> 加入了圈子 <a href="#">足球圈</a> 的活动 <a href="#">足球比赛</a></li>
				<li><a href="#">歪歪</a> 评论了 <a href="#">歪歪</a> 的相片</li>
				<li><a href="#">歪歪</a> 加入了圈子 <a href="#">足球圈</a> 的活动 <a href="#">足球比赛</a></li>
				<li><a href="#">歪歪</a> 评论了 <a href="#">歪歪</a> 的相片</li>
				<li><a href="#">歪歪</a> 加入了圈子 <a href="#">足球圈</a> 的活动 <a href="#">足球比赛</a></li>
				<li><a href="#">歪歪</a> 评论了 <a href="#">歪歪</a> 的相片</li>
				<li><a href="#">歪歪</a> 加入了圈子 <a href="#">足球圈</a> 的活动 <a href="#">足球比赛</a></li>
				<li><a href="#">歪歪</a> 评论了 <a href="#">歪歪</a> 的相片</li>
				<li><a href="#">歪歪</a> 加入了圈子 <a href="#">足球圈</a> 的活动 <a href="#">足球比赛</a></li>
				<li><a href="#">歪歪</a> 评论了 <a href="#">歪歪</a> 的相片</li>
				<li><a href="#">歪歪</a> 加入了圈子 <a href="#">足球圈</a> 的活动 <a href="#">足球比赛</a></li>
				<li><a href="#">歪歪</a> 评论了 <a href="#">歪歪</a> 的相片</li>
				<li><a href="#">歪歪</a> 加入了圈子 <a href="#">足球圈足球圈足球圈足球圈</a> 的活动 <a href="#">足球比赛足球比赛足球比赛足球比赛足球比赛足球比赛足球比赛</a></li>
			</ul>
		</div>
		<div class="assn">
			<h4><a href="#" class="on" id="tab21" onmouseover="switchTab('tab21','tab2',2)">热门社团</a>
				<a href="#" id="tab22" onmouseover="switchTab('tab22','tab2',2)">社团话题</a></h4>
			<ul id="Conttab21" style="display:block">
				<li><img src="../../images/img3.gif" />
					<span><a href="#">社团名称社团名称</a></span>
					<em>公开小组 12345名成员</em></li>
				<li><img src="../../images/img3.gif" />
					<span><a href="#">社团名称社团名称</a></span>
					<em>公开小组 12345名成员</em></li>
				<li><img src="../../images/img3.gif" />
					<span><a href="#">社团名称社团名称</a></span>
					<em>公开小组 12345名成员</em></li>
				<li><img src="../../images/img3.gif" />
					<span><a href="#">社团名称社团名称</a></span>
					<em>公开小组 12345名成员</em></li>
				<div class="clear"></div>
			</ul>
			<ol id="Conttab22" style="display:none">
				<li><a href="#">社团话题社团话题社团话题社团话题</a></li>
				<li><a href="#">社团话题社团话题社团话题社团话题</a></li>
				<li><a href="#">社团话题社团话题社团话题社团话题</a></li>
				<li><a href="#">社团话题社团话题社团话题社团话题</a></li>
				<li><a href="#">社团话题社团话题社团话题社团话题</a></li>
				<li><a href="#">社团话题社团话题社团话题社团话题</a></li>
				<li><a href="#">社团话题社团话题社团话题社团话题</a></li>
				<li><a href="#">社团话题社团话题社团话题社团话题</a></li>
				<li><a href="#">社团话题社团话题社团话题社团话题</a></li>
			</ol>
		</div>
		<div class="palaestra">
			<h4>推荐场馆</h4>
			<ul>
				<p><img src="${ptDto.pictureUrl}" />
					<span><a href="#">${ptDto.name}</a></span>
					<cite><em>地址：</em>${ptDto.name}</cite>
					<cite>项目：${ptDto.ownType}</cite>
				</p>
				<li><img src="../../images/img4.gif" /><span><a href="#">场馆名称场馆名称</a></span></li>
				<li><img src="../../images/img4.gif" /><span><a href="#">场馆名称场馆名称</a></span></li>
				<li><img src="../../images/img4.gif" /><span><a href="#">场馆名称场馆名称</a></span></li>
			</ul>
		</div>
	</div>
	<div class="main_right">
		<div class="login">
			<img src="../../images/img2.jpg" />
			<a href="#"><img src="../../images/login1.jpg" /></a>
			<a href="#"><img src="../../images/login2.jpg" /></a>
		</div>
		<div class="people">
			<h4>动趣用户</h4>
			<ul>
				<li><img src="../../images/img3.gif" />
					<span><a href="#">歪歪</a></span>
					<cite>[羽毛球]</cite>
					<em>LV30</em></li>
				<li><img src="../../images/img3.gif" />
					<span><a href="#">歪歪</a></span>
					<cite>[羽毛球]</cite>
					<em>LV30</em></li>
				<li><img src="../../images/img3.gif" />
					<span><a href="#">歪歪</a></span>
					<cite>[羽毛球]</cite>
					<em>LV30</em></li>
				<li><img src="../../images/img3.gif" />
					<span><a href="#">歪歪</a></span>
					<cite>[羽毛球]</cite>
					<em>LV30</em></li>
				<li><img src="../../images/img3.gif" />
					<span><a href="#">歪歪</a></span>
					<cite>[羽毛球]</cite>
					<em>LV30</em></li>
				<li><img src="../../images/img3.gif" />
					<span><a href="#">歪歪</a></span>
					<cite>[羽毛球]</cite>
					<em>LV30</em></li>
				<li><img src="../../images/img3.gif" />
					<span><a href="#">歪歪</a></span>
					<cite>[羽毛球]</cite>
					<em>LV30</em></li>
				<li><img src="../../images/img3.gif" />
					<span><a href="#">歪歪</a></span>
					<cite>[羽毛球]</cite>
					<em>LV30</em></li>
				<li><img src="../../images/img3.gif" />
					<span><a href="#">歪歪</a></span>
					<cite>[羽毛球]</cite>
					<em>LV30</em></li>
				<li><img src="../../images/img3.gif" />
					<span><a href="#">歪歪</a></span>
					<cite>[羽毛球]</cite>
					<em>LV30</em></li>
			</ul>
			<div class="clear"></div>
		</div>
		<div class="game">
			<h4><a href="#" class="on" id="tab31" onmouseover="switchTab('tab31','tab3',2)">最新比赛</a>
				<a href="#" id="tab32" onmouseover="switchTab('tab32','tab3',2)">最新活动</a></h4>
			<ul id="Conttab31" style="display:block">
				<p><span><a href="#">比赛名比赛名比赛名比赛名比赛名</a></span>
					<cite>项 目：羽毛球</cite>
					<cite>时 间：12月25日 19:00 - 12月25日 21:00</cite>
					<cite><em>地 点：</em><font>北京市 东城区 大运村体育馆<br />海淀区大运村33号</font></cite>
				</p>
				<li><span><a href="#">[羽毛球]</a></span>
					<em><strong><a href="#">首体羽毛球双打双打双打</a></strong>
						<cite>12月25日 19:00 - 12月25日 21:00</cite></em></li>
				<li><span><a href="#">[羽毛球]</a></span>
					<em><strong><a href="#">首体羽毛球双打双打双打</a></strong>
						<cite>12月25日 19:00 - 12月25日 21:00</cite></em></li>
				<li><span><a href="#">[羽毛球]</a></span>
					<em><strong><a href="#">首体羽毛球双打双打双打</a></strong>
						<cite>12月25日 19:00 - 12月25日 21:00</cite></em></li>
				<li><span><a href="#">[羽毛球]</a></span>
					<em><strong><a href="#">首体羽毛球双打双打双打</a></strong>
						<cite>12月25日 19:00 - 12月25日 21:00</cite></em></li>
				<li><span><a href="#">[羽毛球]</a></span>
					<em><strong><a href="#">首体羽毛球双打双打双打</a></strong>
						<cite>12月25日 19:00 - 12月25日 21:00</cite></em></li>
				<div class="clear"></div>
			</ul>
			<ul id="Conttab32" style="display:none">
				<p><span><a href="#">活动名活动名活动名活动名活动名</a></span>
					<cite>项 目：羽毛球</cite>
					<cite>时 间：12月25日 19:00 - 12月25日 21:00</cite>
					<cite><em>地 点：</em><font>北京市 东城区 大运村体育馆<br />海淀区大运村33号</font></cite>
				</p>
				<li><span><a href="#">[羽毛球]</a></span>
					<em><strong><a href="#">首体羽毛球双打双打双打</a></strong>
						<cite>12月25日 19:00 - 12月25日 21:00</cite></em></li>
				<li><span><a href="#">[羽毛球]</a></span>
					<em><strong><a href="#">首体羽毛球双打双打双打</a></strong>
						<cite>12月25日 19:00 - 12月25日 21:00</cite></em></li>
				<li><span><a href="#">[羽毛球]</a></span>
					<em><strong><a href="#">首体羽毛球双打双打双打</a></strong>
						<cite>12月25日 19:00 - 12月25日 21:00</cite></em></li>
				<li><span><a href="#">[羽毛球]</a></span>
					<em><strong><a href="#">首体羽毛球双打双打双打</a></strong>
						<cite>12月25日 19:00 - 12月25日 21:00</cite></em></li>
				<li><span><a href="#">[羽毛球]</a></span>
					<em><strong><a href="#">首体羽毛球双打双打双打</a></strong>
						<cite>12月25日 19:00 - 12月25日 21:00</cite></em></li>
				<div class="clear"></div>
			</ul>
		</div>
		<div class="train">
			<h4>课程培训</h4>
			<ul>
				<p><img src="../../images/img5.gif" />
					<span><a href="#">课程名称课程名称</a></span>
					<cite>教 练：<font>歪歪(信誉222)</font></cite>
					<cite>项 目：<em>羽毛球</em></cite>
					<cite>场 馆：<em>场馆名场馆名</em></cite>
				</p>
				<li>[羽毛球]<a href="#">课程名称课程名称课程名称</a></li>
				<li>[羽毛球]<a href="#">课程名称课程名称课程名称</a></li>
				<li>[羽毛球]<a href="#">课程名称课程名称课程名称</a></li>
				<li>[羽毛球]<a href="#">课程名称课程名称课程名称</a></li>
				<li>[羽毛球]<a href="#">课程名称课程名称课程名称</a></li>
			</ul>
		</div>
	</div>
	<div class="clear"></div>
</div>
<div class="footer">
	<ul><span>&copy; 2009-2010 dongqu.com All Rights Reserved</span><em><a href="#">动趣简介</a> │ <a href="#">广告服务</a> │ <a href="#">联系我们</a> │ <a href="#">诚聘英才</a> │ <a href="#">使用帮助</a> │</em></ul>
	<ol><span><img src="../../images/gongshang.gif" /> [沪ICP备09060416号]</span><em><img src="../../images/logo_bottom.gif" /></em></ol>
</div>
</body>
</html>
