<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
 <%@ taglib prefix="sd" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>离店信息</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta charset="UTF-8">
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
</head>

<body>
	<h2 style="margin-left:50px;margin-top:10px">离店信息</h2>
    	<form class="form-horizontal" role="form" style="width:600px;margin-top:50px;margin-left:40px" action="leave">
				<div class="form-group">
					 <label class="col-sm-2 control-label">房间号</label>
					<div class="col-sm-10" style="width:300px">
						<input type="text" class="form-control" name="roomNum" />
					</div>
				</div>
				<div class="form-group">
					 <label class="col-sm-2 control-label">入住人姓名</label>
					<div class="col-sm-10" style="width:300px">
						<input type="text" class="form-control" name="customerID" />
					</div>
				</div>
				<div class="form-group">
					 <label  class="col-sm-2 control-label">应付</label>
					<div class="col-sm-10" style="width:300px">
						<input type="text" class="form-control" name="pay" />
					</div>
				</div>
				<div class="form-group">
					 <label class="col-sm-2 control-label">实付（会员0.8折）</label>
					<div class="col-sm-10" style="width:300px">
						<input type="text" class="form-control" name="pay2" />
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label"></label>
					<div class="col-sm-4" style="width:300px">
						<input type="submit" class="form-control" value="确认离店" />
					</div>
				</div>
			</form>
			
</body>
</html>