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
	<h1>리스트 페이지</h1>
	<table border="1" style="text-align: center">
		<thead style="background-color: pink">
			<tr>
				<td>부서번호</td>
				<td>부서명</td>
				<td>부서위치</td>
				<td>삭제</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dept" items="${depts}">
				<tr>
					
						<td>${dept.deptno}</td>
						<td>${dept.dname}</td>
						<td>${dept.loc}</td>
						<td>	
							<form action="${pageContext.request.contextPath}/dept/erase" method="post">					
								<input type="hidden" name="deptno" value="${dept.deptno}">
								<input type="hidden" name="dname" value="${dept.dname}">
								<input type="hidden" name="loc" value="${dept.loc}">
								<input type="submit" value="제거">
							</form>
						</td>
				
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<hr>
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
				<td colspan="2"><input type="submit" value="추가"></td>
			</tr>
		</table>
	</form>
</body>
</html>