<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    int count = (int)session.getAttribute("count");//Object => int : 강제로변환
    count++;
    session.setAttribute("count", count);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
현재 count : <%= session.getAttribute("count") %>
${count}
<%-- <%= session.getAttribute("count")%>와 ${count} 동일 = 세션의 결과값 프린트할때 사용  --%>
<hr>
<a href = "page05.jsp">변경된 카운트값 확인</a>
</body>
</html>