<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>주문정보입니다.</h3>
<hr color = "red">
<form action = "pay04.jsp">
주문 물건 id : <input type ="text" name = "productId"><br>
주문 물건 name : <input type ="text" name = "productName"><br>
주문 총 금액 : <input type ="text" name = "total"><br>
주문자 id : <input type ="text" name = "uId" value="summer"><br>
<button>결제하기</button>
</form>
</body>
</html>