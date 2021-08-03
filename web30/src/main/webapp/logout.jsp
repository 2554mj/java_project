<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 세션을 끊어주는 처리를 해야함. -->
    <%
    //id 세션만 제거 할 경우
    //session.removeAttribute("id");
    //모든 세션을 제거 할 경우
    session.invalidate();
    //서버가 브라우저한테 명령하는 객체 => response(:서버가 클라이언트에게 특정한 처리를 하라고 명령할 때 사용)
    //<-> 클라이언트가 입력한 것을 서버가 받아오는 객체 => request(:클라이언트로 부터 넘어온 데이터를 받을 때 사용)
    //(니가 메인페이지 자동으로 호출해)
    response.sendRedirect("login.jsp");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>