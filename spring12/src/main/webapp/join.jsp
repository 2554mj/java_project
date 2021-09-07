<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <title>Giga Box 회원가입</title>
</head>
<body>
 <h1>회원가입</h1>
<hr>
 <form action = "join.gigabox"> 
	아이디 : <input name="piid"> <br>
	비밀번호 : <input name="pw"> <br>
	이름 : <input name="name"> <br>
	생년월일 : <input name="birth"> <br>
	전화번호 : <input name="tel"> <br>
	E-MAIL: <input name="email"> <br>
	TICKETMACHINE : <input name="ticketmachine"> <br>
	MYGIGABOX : <input name="mygigabox"> <br>
	TERMS : <input name="terms"> <br>
	MAKETING : <input name="maketing"> <br>
	METHOD : <input name="method"> <br>
	<button>회원가입처리</button>
 </form>
<br><br>
<hr>
 <form action = "piserch.gigabox"> 
	아이디 : <input name="piid"> <br>
	<button>회원정보검색</button>
 </form>



</body>
</html>