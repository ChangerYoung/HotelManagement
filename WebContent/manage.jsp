<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>会员管理</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<style>html,body{text-align:center;margin:0px?auto;}</style>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">-->
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style>
		table{
			text-align: center;
		}
		.delete{
			color:#fff;
		}
	</style>
	<script type="text/javascript">
	$.ajax({
    	 type : "get",
         url: 'ShowVIP',
         data:{},
         dataType: "json",
         success: function (data1) {
        	 /*data在里应该是一个json对象数组*/
        	// alert(data1);
        	var text = "";
        	var txt = "<a class='delete' href=\"Remove?customerID="
        	var txt2 = "\">删除</a>"
             $.each(data1, function (ind, val) {
            	// alert(val.roomNum);
            	text+="<tr><td>"+val.customerName+"</td><td>"+val.customerID+"</td><td>"+val.VIPNum+"</td><td>"+val.phone+"</td><td>"+txt+val.customerID+txt2+"</td></tr>"
                
             })
             //alert(text);
             $(".infor").html(text);
            // text = "";
         }

     })
</script>
  </head>
  
  <body>
			<table class="table" >
				<thead>
					<tr>
						<th>姓名</th>
						<th>身份证号</th>
						<th>手机号</th>
						<th>会员卡号</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody class="infor">
				<!-- <td>
							<button type="button" class="btn ">删除</button>
						</td> -->
				<!-- <a href='<s:url action="Remove"><s:param name="isbn" value="123456" /></s:url>'>
                                Delete
                            </a> -->
				</tbody>
				<button type="button" class="btn btn-large btn-success"><a href="addVIP.jsp"><big>增加会员<big/></a></button>
  </body>
</html>
