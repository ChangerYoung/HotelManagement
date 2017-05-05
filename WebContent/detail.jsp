<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<meta charset="UTF-8">
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	

  </head>
  
  <body>
  
  <h1>
  
  
                          
                                                    详情
  </h1>
  
    <div class="container-fluid">
	<div class="row-fluid">
		<div class="span12">
			<form class="form-horizontal">
				<div class="control-group">
					<label>入住人</label>
					<div class="controls">
						<input type="text" />
					</div>
				<div class="control-group">
					<label>时间</label>
					<div class="controls">
						<input type="text" />
					</div>
					<div class="control-group">
					<label>房间号</label>
					<div class="controls">
						<input type="text" />
					</div>
					<div class="control-group">
					<label>单价</label>
					<div class="controls">
						<input type="text" />
					</div>
					<div class="control-group">
					<label>离店日期</label>
					<div class="controls">
						<input type="text" />
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>
