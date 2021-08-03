<%@page import="shop.dto.게시판Bag"%>
<%@page import="shop.db.게시판DAO2"%>
<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

String id = request.getParameter("id");

게시판DAO2 dao = new 게시판DAO2();

게시판Bag bag = dao.read(id);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">


<table border="1">
<td>아이디</td>
<td>제목</td>
<td>내용</td>
<td>작성자</td>
</tr>

<tr>
<td><%= bag.getId() %></td>
<td><%= bag.getTitle() %></td>
<td><%= bag.getContent() %></td>
<td><%= bag.getWriter() %></td>
</tr>
</table>

</body>
</html>