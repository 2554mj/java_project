<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="shop.dto.게시판Bag"%>
<%@page import="shop.db.게시판DAO2"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    게시판DAO2 dao = new 게시판DAO2();
    ArrayList<게시판Bag> list = dao.read();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
전체 게시판 목록의 개수 <%= list.size() %>
<hr>
<%= list %>
<hr color="red">
<% 
for(int i = 0; i < list.size(); i++){
	게시판Bag dto = list.get(i);

%>
게시판 id: <%= dto.getId() %><br>
게시판 title: <%= dto.getTitle() %><br>
게시판 content: <%= dto.getContent() %><br>
게시판 writer: <%= dto.getWriter() %><br><br>
<%}%>

<hr color="blue">
<% 
for(게시판Bag dto : list){

%>
게시판 id: <%= dto.getId() %><br>
게시판 title: <%= dto.getTitle() %><br>
게시판 content: <%= dto.getContent() %><br>
게시판 writer: <%= dto.getWriter() %><br><hr>
<%}%>

<hr color="green">
<table border="1">
<tr bgcolor: "yellow">
<td>아이디</td>
<td>제목</td>
<td>내용</td>
<td>작성자</td>
</tr>
<% 
for(게시판Bag dto : list) {

%>
<tr>
<td><%= dto.getId() %></td>
<td><a href="http://localhost:8889/web28/read2.jsp?id=<%= dto.getId() %>">
<%= dto.getTitle() %></a></td>
<td><%= dto.getContent() %></td>
<td><%= dto.getWriter() %></td>
</tr>
<%}%>
</table>

</body>
</html>