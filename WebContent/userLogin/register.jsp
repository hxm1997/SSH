<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="utf-8" />
		<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<title></title>
		<style>
			.registerDiv{
				margin-left: 500px;
				margin-top: 250px;
				width: 300px;
				background: white;
		
			}
			
			dd{
				padding-top: 1px;
				
			}
		
			form{
				border:1px solid gray;
			}
			ul{
				padding: ;
			}
			
		</style>
	</head>
	<body  style="background-color:deepskyblue">
		
		<script src="js/bootstrap.min.js"></script>
		<div class="registerDiv">
		
			<form  action="register" method="post">
			<h1>欢迎注册</h1><br>
			<dd>用户名:<input type="text" name="u.userName" /></dd><br />
			<dd>密码:<input type="text" name="u.passWord"/></dd><br />
			<dd>电话:<input type="text" name="u.userTel"/></dd><br />
			<dd>姓名:<input type="text" name="u.realName"/></dd><br />
				<ul><input type="submit"  value="提交"  class="btn-success"/></ul>
			    <ul><input type="reset"   value="重置"  name="reset" class="btn-danger"/></ul>
			</form> 
		</div>
			
	</body>
</html>