<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%
    String id = request.getParameter("id");
    String id2 = "root";
    String result = "로그인 실패";
    if(id.equals(id2)){
    	result = "로그인 성공";
    	session.setAttribute("id2", id);
    }
    else{//자바안에서 브라우저에 나타나게 해주는 객체
    	out.print("다시 로그인 해주세요!<br>");
    	
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= result %><br>
<% if(session.getAttribute("id2") != null)  { %>
세션 id값은 : <%= session.getAttribute("id2") %>
<form action="news.jsp">
<button>news</button></form>

<form action="mail.jsp">
<button>mail</button></form>

<form action="cafe.jsp">
<button>cafe</button></form>
<% } %>


</body>
</html>