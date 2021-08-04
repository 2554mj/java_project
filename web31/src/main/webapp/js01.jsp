<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
//alert('tern project')
function idCheck(){
	//1.id의 입력한 값 가지고오기=> id가 id인 input 태그를 찾자 > 그 태그내에 있는 value값을 가져오자
	//id가 아닌 name을 써도 괜찮지만, 잘 사용하지 않음  
	//자바스크립트에서 바디의 내용을 가져오는 내장된 객체 > document
	//엘리멘트 html의 요소 = tag
	idTag = document.getElementById("id");
	idValue = idTag.value;
	alert('id is' + idValue);
	alert('id length' + idValue.length);

	//2. 값의 글자수를 카운트
	
	//3. 5글자 이상이 아닌 경우, 메시지를 보여주어야 함.
	if (idValue.length >= 5) {
		result = "5글자 이상입니다. 유효합니다."
	}else {
		result = "5글자 미만입니다@@재입력해주세요@@"
	}
	divTag = document.getElementById("result");//"result"라고 적어줘야함 result로 쓰면 변수로 인식
	divTag.innerHTML = result;
}
function pw1Check(){
	//버튼1개=함수1개
	pw1Tag = document.getElementById("pw1");
	pw1Value = pw1Tag.value;
	//8글자이상인지 확인
	if (pw1Value.length >= 8) {
		result = "사용가능한 비밀번호입니다."
	}else {
		result = "@@비밀번호를재입력해주세요!@@"
	}
	divTag = document.getElementById("result");
	divTag.innerHTML = result;
}
function pw2Check(){
	//버튼1개=함수1개
	//function pw1Check()에서 사용했던 pw1의 값을 재사용해도 기능은 구현되지만,
	//위의 함수를 지울경우 pw2Check()함수에도 문제가 생기므로 다시 값을 가지고 와준다. 
	//특히, 입출력값의 id를 동일하게 부여할 경우 문제多
	//좋은 코드는 다른 기능을 삭제하더라도 현재 기능의 문제가 생기지 않도록 작성해야한다.
	pw1Tag = document.getElementById("pw1");
	pw1Value = pw1Tag.value;
	pw2Tag = document.getElementById("pw2");
	pw2Value = pw2Tag.value;
	//pw1과 동일한지 여부 확인
	result = "불일치<img src=img/no.jpg>"
	if (pw1Value == pw2Value) {
		result = "일치!<img src=img/ok.png>"
	}
	divTag = document.getElementById("result");//<div></div>이 태그사이에 값을 넣어줄때 사용
	divTag.innerHTML = result;
	pw1Tag.value = " "
	pw2Tag.value = " "
}
</script>
</head>
<body>
아이디 : <input name="id" id="id" value="test"> <button onclick="idCheck()" id="b1">글자수 체크</button><br> 
패스워드 : <input name="pw1" id="pw1"> <button onclick="pw1Check()" id="b2">패스워드 체크</button><br>
패스워드2 : <input name="pw2" id="pw2"> <button onclick="pw2Check()" id="b3">패스워드 동일여부체크</button><br>
<hr>
<div id="result" style="color:red; background:yellow; width:500px; height:50px; font-size:30px"></div>
</body>
</html>