<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>게임</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
<style>
</style>
</head>
<body class="d-flex flex-column justify-content-between vh-100">
	<header>
		<nav class="navbar navbar-expand-lg bg-body-tertiary"
			data-bs-theme="dark">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">게임 사이트</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item">
							<a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/lotto/list.do">로또</a>
						</li>
						<li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/rsp/rsp_game">가위바위보</a>
                        </li>
<%--                         <li class="nav-item">
                            <a class="nav-link" href="${pageContext.request.contextPath}/board/list.do">게시판</a>                          
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" href="${pageContext.request.contextPath}/gugudan">구구단</a>
                        </li> --%>
					</ul>
					<form class="d-flex" role="search">
						<input class="form-control me-2" type="search"
							placeholder="Search" aria-label="Search">
						<button class="btn btn-outline-success" type="submit">Search</button>
					</form>
				</div>
			</div>
		</nav>
	</header>
	<main>
		<div class="container">
			<div class="row">
				<c:forEach var="num" items="${lotto.arrList}">
					<div class="col-lg-2 mt-3 d-flex justify-content-center">
						<svg class="rounded-circle" width="140" height="140" focusable="false">
					       	<rect width="100%" height="100%" fill="${lotto.getBackground(num)}" />
							<text text-anchor="middle" x="50%" y="50%" fill="white" dy=".3em" font-size="60">${num}</text>
			            </svg>
					</div>
				</c:forEach>
			</div>
			<div class="row">
				<div class="col-lg-12 mt-3 d-flex justify-content-center">
					<svg class="rounded-circle" width="140" height="140" focusable="false">
				       	<rect width="100%" height="100%" fill="white" />
						<text text-anchor="middle" x="50%" y="50%" fill="black" dy=".3em" font-size="60">+</text>
		            </svg>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12 mt-3 d-flex justify-content-center">
					<svg class="rounded-circle" width="140" height="140" focusable="false">
				       	<rect width="100%" height="100%" fill="${lotto.getBackground(lotto.getBonusNum())}" />
						<text text-anchor="middle" x="50%" y="50%" fill="white" dy=".3em" font-size="60">${lotto.bonusNum}</text>
		            </svg>				
				</div>
			</div>

		</div>
	</main>
    <footer class="text-center ">
    	<hr>
    	<div class="d-flex justify-content-evenly">
	    	<div class="col">
	    	</div>
	        <div class="col align-middle">
	        	<p>© Company 2023-2024 </p>
	        </div>
	        <div class="col">
	        	<p id="nowDate" class=" border p-1 rounded bg-info text-white"></p>
	        </div>
	        <script>
				function time(){
					let nowDate = new Date();
					let nowHour = nowDate.getHours();
					let nowMinute = nowDate.getMinutes();
					let nowSecond = nowDate.getSeconds();
					
					let dateStr = "현재 시각 : "+ nowHour + "시 " + nowMinute + "분 " + nowSecond + "초";
					
					let nowDateElement = document.getElementById("nowDate");				
					nowDateElement.innerHTML = dateStr;
				}			
				setInterval(time,1000);
		    </script>
		</div>
    </footer>
</body>
</html>