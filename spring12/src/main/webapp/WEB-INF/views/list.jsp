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
<!-- 페이지지시자 : 
c = html태그를 사용했지만, 자바로 만들었다고 지시해주는 역할
지정하면 상단에 지정했다고 알려줘야함! 3열 : taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  -->
	<c:forEach items="${list}" var="dto">
		${dto}<br>
	</c:forEach>
</body>
</html>