<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 1.서버로 전송된 데이터를 받아야함:java필요 -->
<%
//HttpServletRequest request = new HttpServletRequest();
String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");
String tel = request.getParameter("tel");
%>
<!-- 2.DB에 넣어야함:java필요 --> 
<!-- 3.DB가 잘처리되었는지 확인메세지를 클라이언트에게 보내주기:클라이언트는 HTML만 알아들음-->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor='yellow'>
회원정보가 잘 도착하였음<br>
서버에 도착한 id는 <%= id %><br>
서버에 도착한 pw는 <%= pw %><br>
서버에 도착한 name는 <%= name %><br>
서버에 도착한 tel는 <%= tel %><br>

</body>
</html>