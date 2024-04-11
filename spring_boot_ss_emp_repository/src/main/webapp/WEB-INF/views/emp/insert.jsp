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
	<h1>사원 정보 입력 페이지</h1>
	<form action="${pageContext.request.contextPath}/emp/register" method="post">
		<table>
			<tr>
				<td>사원번호</td>
				<td><input type="number" name="empno"></td>
			</tr>
			<tr>
				<td>사원명</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>직업</td>
				<td>
					<select name="job">
						<c:forEach var="jobone" items="${jobs}">
							<option value="${jobone}">${jobone}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>매니저</td>
				<td>
					<select name="mgr">
						<c:forEach var="mgrone" items="${mgrs}">
							<option value="${mgrone.empno}">${mgrone.ename}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>입사일</td>
				<td><input type="date" name="hiredateStr"></td>
			</tr>
			<tr>
				<td>월급</td>
				<td><input type="number" name="sal"></td>
			</tr>
			<tr>
				<td>성과금</td>
				<td><input type="number" name="comm"></td>
			</tr>
			<tr>
				<td>부서번호</td>
				<td>
					<select name="deptno">
						<c:forEach var="dept" items="${depts}">
							<option value="${dept.deptno}">${dept.dname}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="추가"> <input type="reset" value="초기화"></td>
			</tr>
		</table>
	</form>
</body>
</html>