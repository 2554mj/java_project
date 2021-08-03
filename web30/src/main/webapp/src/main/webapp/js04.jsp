<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

function add(x,y) {
	alert(num1 + num2)
	}
function minus() {
	alert(num1 - num2)
	}
function multiply() {
	alert(num1 * num2)
	}
function divide() {
	alert(num1 / num2)
	}
	

no1 = prompt("첫번째 숫자를 입력해주세요.")
no2 = prompt("두번째 숫자를 입력해주세요.")

num1 = parseInt(no1)
num2 = parseInt(no2)



</script>
</head>
<body>
<button style=onclick="add()"> 더하기 </button>
<button style=onclick="minus()"> 빼기 </button>
<button style=onclick="multiplye()"> 곱하기 </button>
<button style=onclick="divide()"> 나누기 </button>
</body>
</html>