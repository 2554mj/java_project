<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%//여러가지가 다 들어간다
    session.setAttribute("count", 100);// int => Object : Onject가 더 큰 개념, 자동변환됨
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
현재 count : <%= session.getAttribute("count") %><!-- 표현식에는 ; 사용하지 않음 -->
<hr>
<a href = "page04.jsp">변경된 카운트값 다시 세션 저장</a>

</body>
</html>