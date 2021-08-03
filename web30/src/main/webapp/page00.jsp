<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //1. 쿠키객체를 만든다. 2개를 만듬.
    //2. 쿠키를 브라우저에 심는다.
   //쿠키는 20개 정도까지만 넣을 수 있고, 값도 길이가 정해져있음. => 장바구니 구현 어려움
    Cookie c1 = new Cookie("category", "운동");
    Cookie c2 = new Cookie("type", "축구");
    
    c1.setMaxAge(0);//쿠키 바로 삭제는 setMacAge를 (0)으로 해서 넣어준다. 쿠키의 생명주기를 줄 수 있음.
   //()안은 초단위임 
   
 
    response.addCookie(c1);
    response.addCookie(c2);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
@@쿠키저장됨@@
<br><a href="page02.jsp">쿠키확인</a>
</body>
</html>