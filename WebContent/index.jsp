<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>优居酒店信息管理系统</title>
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/* Custom Styles */
    ul.nav-tabs{
        width: 140px;
        margin-top: 20px;
        border-radius: 4px;
        border: 1px solid #ddd;
        box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);
    }
    ul.nav-tabs li{
        margin: 0;
        border-top: 1px solid #ddd;
    }
    ul.nav-tabs li:first-child{
        border-top: none;
    }
    ul.nav-tabs li a{
        margin: 0;
        padding: 8px 16px;
        border-radius: 0;
    }
    ul.nav-tabs li.active a, ul.nav-tabs li.active a:hover{
        color: #fff;
        background: #0088cc;
        border: 1px solid #0088cc;
    }
    ul.nav-tabs li:first-child a{
        border-radius: 4px 4px 0 0;
    }
    ul.nav-tabs li:last-child a{
        border-radius: 0 0 4px 4px;
    }
    ul.nav-tabs.affix{
        top: 30px; /* Set the top position of pinned element */
    }
    .tittle{
    	color:#ffffff;
    }
    a:link {
		color:#C1B4B4;
	    text-decoration:none;
	}
	
	a:visited {
	    color:#00FF00;
	    text-decoration:none;
	}
	    
	a:hover {
	    color:#000000;
	    text-decoration:none;
	    }
    
</style>
</head>
<body data-spy="scroll" data-target="#myScrollspy">

<div class="container">
   <div class="jumbotron" style="background:rgb(28,28,28)">
        	<h2 class="tittle">优居酒店管理系统
            <div class="yonghucaozuo pull-right">	
                                                                                                                                        
        			<button type="button" class="btn btn-default" style="background:grey"><a class="logout" href="login.jsp">注销</a>   </button>
        			<button type="button" class="btn btn-default" style="background:grey">  <a class="changepw" href="changepw.jsp">修改密码</a>      </button>
        	</div>
        	</h2>
    </div>

         	<ul class="nav nav-tabs" role="tablist" style="color:white;float:left;margin-right:20px;margin-top:-32px;width:100px;height:350px;background:rgb(28,28,28);">
  					<li role="presentation" class="active"><a href="#room" role="tab" data-toggle="tab">房间信息</a></li>
 					 <li role="presentation"><a href="#customer" role="tab" data-toggle="tab" >客户信息</a></li>
 					 <li role="presentation"><a href="#live" role="tab" data-toggle="tab">客户入住   </a></li>
 					 <li role="presentation"><a href="#leave" role="tab" data-toggle="tab">客户离店  </a></li>
  					<li role="presentation"><a href="#manage" role="tab" data-toggle="tab">会员管理</a></li>
  					<li role="presentation"><a href="#statistic" role="tab" data-toggle="tab">统&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp计</a></li>
			</ul>

<!-- Tab panes -->
<div class="tab-content" style="float:left;width:800px;height:350px;">
  <!--start of room-->
  <div role="tabpanel" class="tab-pane active" id="room">
  	<s:include value="/room.jsp"></s:include>
  	<!--<iframe src=""></iframe>-->
  </div>
  <!--start of customer-->
  <div role="tabpanel" class="tab-pane" id="customer">
  	<s:include value="/customer.jsp"></s:include>
  </div>
  <!--start of live-->
  <div role="tabpanel" class="tab-pane" id="live">
  	<s:include value="/live.jsp"></s:include>
  </div>
  <!--start of leave-->
  <div role="tabpanel" class="tab-pane" id="leave">
  	<s:include value="/leave.jsp"></s:include>
  </div>
  <!--start of manage-->
  <div role="tabpanel" class="tab-pane" id="manage">
  	<s:include value="/manage.jsp"></s:include>
  </div>
  <!--start of statistic-->
  <div role="tabpanel" class="tab-pane" id="statistic">
  	<s:include value="/statistic.jsp"></s:include>
  </div>
</div>
        

</div>
</body>
</html>