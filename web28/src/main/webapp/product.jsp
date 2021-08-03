<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
<link rel="stylesheet" href="css/out.css">
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<form action="read3.jsp">
				id: <input name="id"><br>
				<button>상품 검색</button>
			</form>
			<hr>
			<h3>상품전체검색</h3>
			<a href="all3.jsp">전체 검색 페이지로</a>
		</div>
	</div>

</body>
</html>