<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>用户信息</title>
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
	<style>
	.divcenter[style="text-align:center"]
	</style>
	<style type="text/css">
        table {
            border: 1px solid black;
            border-collapse: collapse;
        }
        
        table thead tr th {
            border: 1px solid black;
            padding: 3px;
            background-color: #cccccc;
        }
        
        table tbody tr td {
            border: 1px solid black;
            padding: 3px;
        }
    </style>
	<script type="text/javascript">
	$.ajax({
    	 type : "get",
         url: 'ShowMessage',
         data:{},
         dataType: "json",
         success: function (data) {
        	 /*data在里应该是一个json对象数组*/
        	// alert(data[0].roomNum);
        	var text = "";
             $.each(data, function (ind, val) {
            	// alert(val.roomNum);
            	text+="<tr><td>"+val.roomNum+"</td><td>"+val.customerID+"</td><td>"+val.liveDate+"</td><td>"+val.leaveDate+"</td><td>"+val.isLeft+"</td></tr>"
                
             })
            // alert(text);
             $(".main").html(text);
            // text = "";
         }

     })
</script>
 </head>
  
 <body>
        <table cellspacing="0">
            <thead>
                <tr>
                    <th>房间号</th>
                    <th>身份证号码</th>
                    <th>入住日期</th>
                    <th>离店日期</th>
                    <th>是否离店</th>
                </tr>
            </thead>
            <tbody class="main">
                <!--<s:iterator value="message">
                    <tr>
                    
                        <td><s:property value="roomNum" /></td>
                        <td><s:property value="customerID" /></td>
                        <td><s:property value="liveDate" /></td>
                        <td><s:property value="leaveDate" /></td>
                        <td><s:property value="isLeft" /></td>
                        
                    </tr>
                </s:iterator>-->
            </tbody>
        </table>
 <script></script>
</body>
</html>
