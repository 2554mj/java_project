
<%@page import="DAO.BasketDAO"%>
<%@page import="DTO.BasketDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String basket_no = request.getParameter("basket_no");
String user_id = request.getParameter("user_id");
String user_name = request.getParameter("user_name");
String user_address = request.getParameter("user_address");
String product_no = request.getParameter("product_no");
String product_name = request.getParameter("product_name");
String qty = request.getParameter("qty");
String price = request.getParameter("price");

int basket_no2=Integer.parseInt(basket_no);
int qty2=Integer.parseInt(qty);
int price2=Integer.parseInt(price);


BasketDTO dto = new BasketDTO();
dto.setBasket_no(basket_no2);
dto.setUser_id(user_id);
dto.setUser_name(user_name);
dto.setUser_address(user_address);
dto.setProduct_no(product_no);
dto.setProduct_name(product_name);
dto.setQty(qty2);
dto.setPrice(price2);

BasketDAO dao = new BasketDAO();
dao.create(dto);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
전송된 회원정보의 SQL문을 전송함
</body>
</html>