<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/out.css">
<script type="text/javascript">
function login() {
	id = prompt('ID를 입력해주세요.')
	pw = prompt('PW를 입력해주세요.')
	if(id == 'admin' && pw == '1234' ) {
		location.href = 'http://www.naver.com'
	}
	else {
		location.href = 'http://www.daum.net'
	}
}
 function pay() {
	 price  = 1000
	 lv = prompt('1.일반회원 2.VIP회원')
	 if (lv=='1') {
		alert(price*1.1 + ' 원 입니다.')
	}
	 else if (lv=='2') {
		 alert(price*0.9 + ' 원 입니다.')
	}
	 else {
		 alert('잘못입력하셨습니다@.@')
	}
	 
	
}

</script>
</head>
<body>
<button class='b1' onclick="login()"> 로그인정보 </button>
<button class='b2'onclick="pay()"> 결제금액 </button>
</body>
</html>