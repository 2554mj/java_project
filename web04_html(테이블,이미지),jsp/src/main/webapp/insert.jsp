<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    <!--1.클라이언트가 전송한 데이터들을 가지고 와야한다  -->
    
    <%
  //HttpServletRequest request = new HttpServletRequest(); 애는 자주써서 이미있음, 톰캣에 들어있으므로 다른프로그램 사용한다면 디폴트값이 아님
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String com = request.getParameter("com");
    String tel = request.getParameter("tel");
    String gender = request.getParameter("gender");
    String word = request.getParameter("word");
    String[] hobby = request.getParameterValues("hobby");
    String result = "";
    if(hobby != null){
    	for(String s:hobby){
    		result += s + " ";
    		// result = result + s + " ";
    	}
    }
    else{
    	result = "없음";
    }
    %>
    <!--2.서버가 받은 데이터를 dao를 통해서 db에 저장해야함  -->
    <!--3.db처리의 결과를 클라이언트에게 html로 알려주어야한다  -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>서버에서 받은 값들 정리</h3>
<hr color="green">
서버에서 받은 아이디 : <%= id %><br>
서버에서 받은 패스워드 : <%= pw %><br>
서버에서 받은 이름 : <%= name %><br>
서버에서 받은 연락처 : <%= com %> - <%= tel %><br>
서버에서 받은 성별 : <%= gender %><br>
서버에서 받은 하고싶은말 : <%= word %><br>
서버에서 받은 취미 목록 : <%= result %><br>

</body>
</html>