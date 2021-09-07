<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>검색된 회원 정보입니다.</h1>
<hr>
<!-- $를 사용한 출력은 속성으로 지정된 것만 출력가능! -->
<!-- 즉, session,model속성으로 지정된 것만 가능! -->
검색된 id : ${dto.id} <br>
검색된 pw : ${dto.pw} <br>
검색된 name : ${dto.name} <br>
검색된 tel : ${dto.tel} <br>
<hr>
<a href = "list.mega">회원 정보 전체 목록 가지고오기~@@</a>
</body>
</html>