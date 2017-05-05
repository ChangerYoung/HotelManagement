<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>房间信息</title>
	<style>html,body{text-align:center;margin:0px?auto;}</style>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style>
		.span4{
			float: left;
			width: 30%;
			height:200px;
		}
		.roombtn{
			width:150px;
			height:150px;
		}
	</style>
	<script type="text/javascript">
		$.ajax({
    	 type : "get",
         url: 'ShowRoom',
         data:{},
         dataType: "json",
         success: function (data) {
        	 
             $.each(data, function (ind, val) {
            	// alert(val.roomNum);
            	 txt1 = "button[name="
            	 txt2="]"
             	$(txt1+val.roomNum+txt2).addClass("btn-danger");
                
             })
         }

     })
	</script>
  </head>
  
<body>
	<div class="container">
		<div class="row">
			<div class="span4">
				 <button class=" roombtn btn btn-large btn-success " type="button" name="101"><img src="image/icon.gif"  />101</button>
			</div>
			<div class="span4">
				 <button class="roombtn btn btn-large  btn-success " type="button" name="102"><img src="image/icon.gif"  />102</button>
			</div>
			<div class="span4">
				 <button class="roombtn btn btn-large btn-success" type="button" name="103"><img src="image/icon.gif"  />103</button>
			</div>
		</div>
		<div class="row">
			<div class="span4">
				 <button class="roombtn btn btn-large btn-success" type="button" name="104"><img src="image/icon.gif"  />104</button>
			</div>
			<div class="span4">
				 <button class="roombtn btn btn-large btn-success" type="button" name="105"><img src="image/icon.gif"  />105</button>
			</div>
			<div class="span4">
				 <button class="roombtn btn btn-large btn-success" type="button" name="106"><img src="image/icon.gif"  />106</button>
			</div>
		</div>
	</div>
</body>
</html>
