<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%
    //pId,pName,amount
    	//누가, 얼마나, 무엇을
    	String productId = request.getParameter("productId");
    	String productName = request.getParameter("productName");
    	String uId = request.getParameter("uId");
    	String total = request.getParameter("total");
    	
    %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= uId %>님의 결제 내역은 아래와 같습니다.
<hr>
상품id: <%= productId %> <br>
상품name: <%= productName %> <br>
상품amount: <%= total %> <br>

</body>
</html>