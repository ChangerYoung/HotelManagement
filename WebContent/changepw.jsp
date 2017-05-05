<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
<link rel="stylesheet" href="/css/login.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>修改密码</title>
</head>
<body>
	<div class="container">
		<form action="changePw">
				<div class="col-md-6" style="border-right:1px solid #ddd;">
					<div class="well col-md-10">
						<h3>修改密码</h3>
						<br/>
						<div class="input-group input-group-md">
							<span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-lock"></i></span>
							<input type="password" class="form-control" name="oldPassword" placeholder="请输入旧密码" aria-describedby="sizing-addon1">
						</div>
						<br/>
						<div class="input-group input-group-md">
							<span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-lock"></i></span>
							<input type="password" class="form-control" name="newPassword" placeholder="请输入新密码" aria-describedby="sizing-addon1">
						</div>
						<br/>
						<div class="input-group input-group-md">
							<span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-lock"></i></span>
							<input type="password" class="form-control" name="newPassword2" placeholder="再次输入新密码" aria-describedby="sizing-addon1">
						</div>
						<br/>
						<button type="submit" class="btn btn-success btn-block" >修改密码</button>
						<div style="color:red;">
								 	<s:fielderror />
								 </div>
					</div>
				</div>
			</form>
	</div>
</body>
</html>