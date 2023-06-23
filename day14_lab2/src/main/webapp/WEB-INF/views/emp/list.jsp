<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="" method="get">
<table style="background-color:orange; margin:auto">
<caption>Employee list from Department</caption>
<c:forEach var="emp" items= "${requestScope.emp_list}">
<tr>
<td>${emp.id}</td>
<td>${emp.firstName}</td>
<td>${emp.lastName}</td>
<td>${emp.email}</td>
<td>${emp.joinDate}</td>
</tr>
</c:forEach>


</table>
</form>
</body>
</html>