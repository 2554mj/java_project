<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

String id = request.getParameter("id");
//DB처리하는 DAO에게 주면서 탈퇴하는 SQL문을 만들어서 전송

회원DAO2 dao = new 회원DAO2();

회원Bag bag = dao.read(id);


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
검색된 id는 <%= bag.getId() %><br>
검색된 pw는 <%= bag.getPw() %><br>
검색된 name는 <%= bag.getName() %><br>
검색된 tel는 <%= bag.getTel() %><br>
</body>
</html>