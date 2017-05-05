<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>增加会员</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<style>html,body{text-align:center;margin:0px?auto;}</style>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
     <div class="page-header">
				<h3 style="text-align:center">
					 <big>增加会员</big>
				</h3>
	 </div>
			
				<br />
				<br />
				<br />
				<br />
				<br />
		<form action="addVIP">
				<div class="form-group">
					 <label for="inputName3" class="col-sm-2 control-label">姓    名：</label>
					
						<input type="Name" class="form-control" name="customerName" />
					</div>
				</div>
				<br />
				<div class="form-group">
					 <label for="inputIDNumber3" class="col-sm-2 control-label">身份证号：</label>
					
						<input type="IDNumber" class="form-control" name="customerID" />
					</div>
				</div>
				<br />
				<div class="form-group">
					 <label for="inputPhoneNumber3" class="col-sm-2 control-label">手 机 号：</label>
					
						<input type="PhoneNumber" class="form-control" name="phone" />
					</div>
				</div>
				<br />
				<div class="form-group">
					 <label for="inputHuiyuanNumber3" class="col-sm-2 control-label">会员卡号：</label>
					
						<input type="HuiyuanNumber" class="form-control" name="VIPNum" />
					</div>
				</div>
				<br />
				<br />
				<br />
				<br />
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 <input type="submit" class="btn btn-large"><big>增加会员</big></button>
					</div>
				</div>
		</form>
			
		<br>
  </body>
</html>
