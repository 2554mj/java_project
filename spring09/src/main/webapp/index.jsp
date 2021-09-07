<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Welcome :)
<hr>
<form action = "password.mega"> 
password : <input name="pass"> <br>
<button>암호처리요청</button>
</form>

<hr>
<form action = "login.mega"> 
id : <input name="id"> <br>
pw : <input name="pw"> <br>
<button>로그인</button>
</form>

<hr>
<form action = "check.mega"> 
닉네임 : <input name="nick"> <br>
<button>닉네임확인</button>
</form>
</body>
</html>