<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
 <%@ taglib prefix="sd" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>客户入住</title>
</head>
<s:head theam="xhtml"/>
<sd:head parseContent="true"/>
<body style="background-color:#b7b29d">
	
	<div class="container-fluid" id="LG">
	<div class="row-fluid">
		<div class="span12">
			<form class="form-horizontal" action="live">
				<div class="control-group">
					<label class="control-label" for="inputRoomID">房间号：</label>
					<div class="controls">
						<input id="inputRoomID" type="text" name="roomNum"/>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputName">姓名：</label>
					<div class="controls">
						<input id="inputName" type="text" name="name"/>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputID">身份证号码：</label>
					<div class="controls">
						<input id="inputID" type="text" name="customerID"/>
					</div>
				</div><br/>
				<div>
					<sd:datetimepicker label="入住日期" name="liveDate" value="today" />
				</div><br/>
				<div style="color:#000000">
					<sd:datetimepicker label="离店日期" name="leaveDate" value="today"/>
				</div>
				<div class="control-group">
					<div class="controls">
						<label class="checkbox"><input type="checkbox" name="isVIP" value="1"/> 会员</label> 
						<button class="btn" type="submit">确认入住</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>