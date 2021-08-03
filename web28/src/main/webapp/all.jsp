<%@page import="shop.dto.회원Bag"%>
<%@page import="java.util.ArrayList"%>
<%@page import="shop.db.회원DAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% //이 표시는 '스크립트릿'=>서버에서 돌아가는 주저리주저리 작은프로그램
    // <%= 이 표시는 여기 표현해줘, 보여줘,출력해줘 '표현식'
    
    회원DAO2 dao = new 회원DAO2();
    
    //자바파일자동임포트 : Ctrl+Shift+o
    //jsp파일자동임포트 : 클릭한 뒤 > Ctrl+Shift+m
    ArrayList<회원Bag> list = dao.read();
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= list %>
</body>
</html>