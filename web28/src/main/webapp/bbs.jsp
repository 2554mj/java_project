<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/out.css">
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include><!--html고정되는부분 연결 코드-->
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
			<form action="read2.jsp">
				id: <input name="id"><br>
				<button>게시판 검색</button>
			</form>
			<hr>
			<h3>게시판전체검색</h3>
			<a href="all2.jsp">전체 검색 페이지로</a>
		</div>
	</div>

</body>
</html>