<%@page import="shop.dto.상품Bag"%>
<%@page import="shop.db.상품DAO"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    상품DAO dao = new 상품DAO();
    ArrayList<상품Bag> list = dao.read();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
전체 상품 목록의 개수 <%= list.size() %>
<hr>

<hr color="green">
<table border="1">
<td>아이디</td>
<td>상품명</td>
<td>내용</td>
<td>가격</td>
</tr>
<% 
for(상품Bag dto : list) {

%>
<tr>
<td><%= dto.getId() %></td>
<td><a href=
"http://localhost:8889/web28/read3.jsp?id=<%= dto.getId() %>">
<%= dto.getName() %></a></td>
<td><%= dto.getContent() %></td>
<td><%= dto.getPrice() %></td>
</tr>
<%}%>
</table>

</body>
</html>