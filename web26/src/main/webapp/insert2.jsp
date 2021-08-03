<%@page import="shop.db.게시판DAO2"%>
<%@page import="shop.dto.게시판Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String date = request.getParameter("date");
String title = request.getParameter("title");
String content = request.getParameter("content");

게시판Bag bag = new 게시판Bag();
bag.setId(id);
bag.setDate(date);
bag.setTitle(title);
bag.setContent(content);

게시판DAO2 dao = new 게시판DAO2();
dao.create(bag);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">전송된 회원정보의 SQL문을 전송함
</body>
</html>