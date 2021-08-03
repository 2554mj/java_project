<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%
  //HttpServletRequest request = new HttpServletRequest(); 애는 자주써서 이미있음
    String title = request.getParameter("title");
    String writer = request.getParameter("writer");
    String word = request.getParameter("word");
    String sort = request.getParameter("sort");
    String divi = request.getParameter("divi");
    String date = request.getParameter("date");
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>서버에서 받은 값</h4>
<hr color = 'yellow'>
서버에서 받은 제목 : <%= title %><br>
서버에서 받은 글쓴이 : <%= writer %><br>
서버에서 받은 내용 : <%= word %><br>
서버에서 받은 종류 : <%= sort %><br>
서버에서 받은 부서 : <%= divi %><br>
서버에서 받은 날짜 : <%= date %><br>

</body>
</html>