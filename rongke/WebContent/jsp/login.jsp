<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/login.action" method="post">
		姓名：<input type="text" name="uname">
		<br>
		密码：<input type="password" name="upass">
		<br>
		<input type="submit" value="登录">
	</form>
	<p>${mess}</p>
</body>
</html>