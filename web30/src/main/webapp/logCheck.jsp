<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%//스크립트릿 : 자바 코드의 일부분
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String id2 = "root";
    String pw2 = "pass";
    String result = "로그인 실패";
    if(id.equals(id2) && pw.equals(pw2)){
    	result = "로그인 성공";
    	//로그인 성공하고 나서, id를 세션으로 잡아주어야 한다.
    	//세션도 내장된 객체로 제공된다. 자주 사용해서 미리 만들어놓은 객체 => 내장된 객체(built-in,빌트인 객체) 
    	//자바에서 내장된 객체 => 서버에서 제공, 종류(9개 중 자주쓰는 5개) reqeust, response, session, out, application
    	//자바스크립트에서 내장된 객체 => 클라이언트에서 제공, 종류 location, window, document, history, console
    	session.setAttribute("id", id);
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
로그인 결과: <%= result %><!-- 표현식(expression)=프린트용 --><br>
<!-- 세션이 잡혀있는지 아닌지 체크하고자 하는 경우 세션이 naull인지 확인하면 됨 -->
<!-- 세션이 잡혀있는것 = 세션이 null이 아님 = 로그인이 성공했다 -->
<% if(session.getAttribute("id") != null)  { %>
세션 id값은 : <%= session.getAttribute("id") %>
<a href="logout.jsp">로그아웃처리</a>
<% } %>
</body>
</html>