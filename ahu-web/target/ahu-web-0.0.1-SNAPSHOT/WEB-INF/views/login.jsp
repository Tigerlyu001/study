<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap-theme.css" rel="stylesheet">
<link href="css/login.css" rel="stylesheet">
<title>登录页面</title>
</head>
<body>

	<h1 class="heading">欢迎来到阿虎的个人空间</h1>
	<div class="container">
		<form class="form-horizontal" role="form">
			<div class="form-group">
				<div class="col-sm-10">
					<input type="text" class="form-control" id="username" placeholder="用户名">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-10">
					<input type="text" class="form-control" id="password" placeholder="密&nbsp;&nbsp;&nbsp;&nbsp;码">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="button" class="btn btn-default" id="btn-login" >登录</button>
					<button type="button" class="btn btn-default" id="btn-regist">注册</button>
				</div>
			</div>
		</form>
	</div>



	 <script src="js/jquery-1.9.1.min.js"></script>
	 <script src="js/bootstrap.min.js"></script>
	 <script src="js/login.js"></script>
	
</body>
</html>