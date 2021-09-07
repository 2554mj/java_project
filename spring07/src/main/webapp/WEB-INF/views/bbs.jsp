<%@page import="com.mega.mvc07.BbsDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
게시판 입력 정보 확인
게시판 번호 : ${bbsDTO.bNo} <br> <%-- $(el)와 <%=%>(표현식)는 동일함 이렇게 사용하려면 컨트롤러 변수명을 스프링이 추천해주는걸로 사용해야암--%> 
게시판 제목 : ${bbsDTO.title} <br> 
게시판 내용 : ${bbsDTO.content} <br>
게시판 작성자 : ${bbsDTO.writer} <br>
<hr>
게시판 날짜 : 
</body>
</html>