<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
	<h1>입력 페이지</h1>
	<form action="${pageContext.request.contextPath}/dept/register" method="post">
		<table border="1" style="text-align: center">
			<tr>
				<td>부서번호</td>
				<td><input type="text" name="deptno"></td>
			</tr>
			<tr>
				<td>부서명</td>
				<td><input type="text" name="dname"></td>
			</tr>
			<tr>
				<td>부서위치</td>
				<td><input type="text" name="loc"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="추가"> <input type="reset" value="초기화"></td>
			</tr>
		</table>
	</form>
</body>
</html>