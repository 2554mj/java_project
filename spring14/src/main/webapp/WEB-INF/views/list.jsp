<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	전체프린트 : ${list}
	<hr color = "red">
	<table border=1>
	 <tr>
		<td width="100">아이디</td>
		<td width="100">이름</td>
		<td width="150">전화번호</td>
		<td width="100">상세페이지</td>
		<td width="100">삭제</td>
	 </tr>
<!-- 페이지지시자 : 
c = html태그를 사용했지만, 자바로 만들었다고 지시해주는 역할
지정하면 상단에 지정했다고 알려줘야함! 3열 : taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  -->
    	<c:forEach items="${list}" var="dto">
	     <tr>
		 	<td width="100">${dto.id}</td>
			<td width="100">${dto.name}</td>
			<td width="150">${dto.tel}</td>
			<td width="100">
				<a href="one.do?id=${dto.id}">
					<button>상세페이지로</button>
				</a>
			</td>
			<td width="100">
				<a href="del.do?id=${dto.id}">
					<button>삭제</button>
				</a>
			</td>
			
	  	 </tr>
	 
		${dto}<br>
	   </c:forEach>
	</table>
</body>
</html>