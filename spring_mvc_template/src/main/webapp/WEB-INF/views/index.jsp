<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>
		Welcome !
	</h5>
		<h5>Server Time: ${requestScope.timestamp}</h5>
		<h5><a href="departments/list">show all departments </a></h5>
</body>
</html>