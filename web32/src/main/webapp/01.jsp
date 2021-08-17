<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 타이틀아래 JQEURY cdn 코드넣기 -->
<!-- 엔터도 메모리를 잡아먹는다 그래서 엔터를 다 없애버려 압축(compressed)해놓은 코드 미니마이징한 버젼 작동에는 전혀문제가 없음 => /jquery.min.js 보기에 안예뻐=>어글리/예쁜건=>프리티 -->
<!-- 엔터를 다 없애주는 프로그램도 별도로 있음, 결국 어글리한이유는 용량때문이다 -->
<!-- slim : 모든기능이 없고, 대표적인 기능만 넣어둔 가벼운ver -->
<!-- compressed : 어글리ver -->
<!-- uncompressed : 프리티ver -->
<!-- 우리는 compressed버젼사용! -->
<!-- JQEURY 간단 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
/* 연결따로 입력따로!! <script src=></scr..>요 사이에 코드 넣으면 안대여 */
//document를 ram에 dom tree로 다 읽어 들였으면! document.ready()
$(function() {
	$('#b1').click(function() {
	 alert('버튼을 클릭하셨군요!!')
})
 $('#b2').click(function() {
	 alert('버튼222을 클릭하셨군요!!')
})
 $('#b3').click(function() {
	 alert('버튼333을 클릭하셨군요!!')
})
	
})

</script>
</head>
<body>
	<button id=b1>*버어튼*</button>
	<button id=b2>*버어튼22*</button>
	<button id=b3>*버어튼33*</button>
</body>
</html>