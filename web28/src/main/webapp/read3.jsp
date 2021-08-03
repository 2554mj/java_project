<%@page import="shop.dto.상품Bag"%>
<%@page import="shop.db.상품DAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

String id = request.getParameter("id");
상품DAO dao = new 상품DAO();
상품Bag bag = dao.read(id);

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
<td>이름</td>
<td>내용</td>
<td>가격</td>
</tr>

<tr>
<td><%= bag.getId() %></td>
<td><%= bag.getName() %></td>
<td><%= bag.getContent() %></td>
<td><%= bag.getPrice() %></td>
</tr>
</table>

</body>
</html>