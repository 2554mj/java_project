<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h3 {
background: yellow;
width: 600px;
height: 100px;
font-size: 50px;
text-align: center;
}
#result1{
background: green;
width: 500px;
height: 200px;
font-size: 80px;
text-align: right;
}
.c1{
background: gray;
}

body ul{/* body한칸띄고태그 => body아래의 많은 자손중에서 ul 모두!!! */
color : red;
}
body > ul{/* body>태그 => body "바로"아래의 자식중에서 ul을 하나 찾아라! */
list-style:square;
}
body > #result1 > ul{
font-style: italic;
}
</style>
</head>
<body>
<h3>좋아하는 과목</h3>
  <ul>
    <li class="c1">컴퓨터</li>
    <li class="c1">영어</li>
    <li class="c1">마케팅</li>
  </ul>
  <div id='result1'>결과가보여지는 부분</div>
  <div id='result2'>
    <span>나는결과야1</span>
  <ul>
    <li>오늘은 목요일</li>
    <li>내일은 금요일</li>
  </ul>
  </div>
  특정 태그에 대한 위치를 나타낼 때 사용법
  브라우저에서 f12 > 요소 > 위치정보가 필요한 요소를 선택 > 코드에서 우클릭 > 복사
selector복사 : #result2 > ul
xpath(경로정보)복사 : //*[@id="result2"]/ul
</body>
</html>