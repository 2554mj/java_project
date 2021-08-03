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
		<!--div는 사람이 구역을 임의로 나눈것, 필요에 의해 더 세부적으로나눠도됨-->
		<!--실제로 그냥 다 붙어서 나옴/ 다 독립적인거라 id사용-->
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include><!--html고정되는부분 연결 코드-->
			<!--이 인클루드를 사용하려면 JSP로 만들어야함/이 부품을 사용하지 않는다면 그냥 html로 만들어도됨-->
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
		<h3>회원가입</h3>
			<form action="insert.jsp">
				ID: <input name="id"><br> PW: <input name="pw"><br>
				이름: <input name="name"><br> tel: <input name="tel"><br>
				<button>회원가입 처리</button>
			</form>
			<hr>
			<h3>회원탈퇴</h3>
			<form action="delete.jsp">
				ID: <input name="id"><br>
				<button>회원탈퇴 처리</button>
			</form>
			<hr>
			<h3>정보수정</h3>
			<form action="update.jsp">
				ID: <input name="id"><br> 이름: <input name="name"><br>
				tel: <input name="tel"><br>
				<button>정보수정 처리</button>
			</form>
			<hr>
			<h3>회원검색</h3>
			<form action="read.jsp">
				ID: <input name="id"><br>
				<button>회원검색 처리</button>

				<hr>
				<h3>회원전체검색</h3>
				<a href="all.jsp">전체 검색 페이지로</a>
		</div>
	</div>


</body>
</html>