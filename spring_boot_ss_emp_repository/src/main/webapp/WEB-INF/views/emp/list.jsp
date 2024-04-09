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
	<h1>사원 리스트 페이지</h1>
	<a href="${pageContext.request.contextPath}/emp/insert_view" ><button type="button" style="margin-bottom: 3px;">사원 추가</button></a>
	<table border="1" style="text-align: center">
		<thead style="background-color: pink">
			<tr>
				<td>사원번호</td>
				<td>사원명</td>
				<td>직업</td>
				<td>매니저</td>
				<td>입사일</td>
				<td>월급</td>
				<td>성과금</td>
				<td>부서번호</td>
				<td>삭제</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${emps}">
				<tr>				
					<td>${emp.empno}</td>
					<td>${emp.ename}</td>
					<td>${emp.job}</td>
					<td>${emp.mgr}</td>
					<td>${emp.hiredate}</td>
					<td>${emp.sal}</td>
					<td>${emp.comm}</td>	
					<td>${emp.deptno}</td>				
					<td>	
						<a href="${pageContext.request.contextPath}/emp/remove?empno=${emp.empno}"><button type="button">삭제</button></a>
					</td>			
				</tr>
			</c:forEach>
		</tbody>
	</table>
		
	<hr>
	
	
<%-- 	<h1>입력 페이지</h1>
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
	</form> --%>
</body>
</html>