<%@page import="shop.db.회원DAO2"%>
<%@page import="shop.dto.회원Bag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
//1. 전송된 데인너
String id = request.getParameter("id");
String pw = request.getParameter("pw");
String name = request.getParameter("name");
String tel = request.getParameter("tel");

회원Bag bag = new 회원Bag();
bag.setId(id);
bag.setPw(pw);
bag.setName(name);
bag.setTel(tel);

회원DAO2 dao = new 회원DAO2();
int result = dao.create(bag);
//회원DAO2의 결과를 insert.jsp로 가져오기 위한 코드
//실행여부에 따라 0 또는 1이 넘어옴
String text = "회원 가입 실패했습니다. 재가입해주세요. ";
if(result == 1){
	text = "회원 가입 성공했습니다. 감사합니다. ";
	
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
실행결과는 <%= text %>
</body>
</html>