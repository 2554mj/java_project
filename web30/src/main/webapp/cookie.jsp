<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 쿠키는 브라우저에 심음(정확히 저장되는 위치는 브라우저가 실행되는 pc) -->
    <%
    Cookie c1 = new Cookie("name", "hoingildong");//쿠키는 스트링만되고, 이름이랑 값이 꼭 들어가야함
    Cookie c2 = new Cookie("age", "100");
    
    response.addCookie(c1);//브라우저에게 쿠키를 심으라고 명령함.
    response.addCookie(c2);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
브라우저에 쿠키를 심었음.
<a href="cooCheck.jsp">쿠키확인</a>
</body>
</html>