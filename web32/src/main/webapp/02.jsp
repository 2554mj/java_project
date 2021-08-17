<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
//$() : body태그 안을 먼저 램에 dom tree로 읽어와라(읽어오는것=램에 데이터를 불러들이는 것(loading))
//function : 로딩해온 데이터를 처리해라! 처리해올 대상 바로 옆에 써주니까 함수의 이름을 정해주지 않아도됨.
//이름없는 함수 = anoymous function => 사용자정의함수
//$(function(){})=>즉, body를 읽어들인 후, 입력값으로 넣은 이름없는 함수부분을 실행해주세요!까지 코딩함 
//$('#b1') body에서 b1이라는 노드를 읽어와
$(function() {
	//alert('dom tree를 모두 로딩해옴')
	$('#b1').click(function(){
		location.href="domTree.jsp";
		//;안써도되지만 추후에 어글리버젼으로 쓸거라면 다 써놔야함!
	});
	//$('')여기에 들어갈 수 있는것 => 기본선택자(defalt selector) :tag / id / class
	
	 $('#b2').click(function(){
		in1Value = $('#in1').val()
		//alert(in1Value)
		if (in2Value == 1) {
			location.href = "https://www.starbucks.co.kr"
		}
		else if (in2Value == 2) {
			location.href = "https://www.coffeebeankorea.com"		
		}
		else if (in2Value == 3) {
			location.href = "https://www.organica.kr"
		} 
	 });
		
	
	$('#b3').click(function() {
		in2Tag = $('#in2') //노트 객체
		in3Tag = $('#in3') 
		in2Value = in2Tag.val() //변수
		in3Value = in3Tag.val()
		result1Tag = $('#result1')
		if (in2Value == 1 && in3Value == 1) {
			//alert('우산을 챙기세요!!!')
			//result1Tag.text('우산을 가지고 가자')
			 result1Tag.append('<font color=blue>우산을 가지고 가자</font><br>')
		}//append 자식노드가 맨끝에 추가됨
		else {
			//alert('bye~')
			result1Tag.html('<font color=white> @bye@ </font>')
			//result1Tag.html('<font color=white> @bye@ </font>')
		}
		in2Tag.val(" ")
		in3Tag.val(" ")
	});	
	
});
</script>
  </head>
  <body>
  <button id=b1>사이트이동</button><br>
   먹고 싶은 음식은??  1)커피 2)아이스티 3)생과일주스<br>
  <input id=in1>
  <button id=b2>입력값 읽어서 처리</button><br>
  <hr>
   비가 오나요? 1)온다 2)안온다 <input id=in2><br>
   구름이 많나요? 1)많다 2)아니다 <input id=in3><br>
   <button id=b3>입력값 읽어서 처리2</button><br>
   <hr color=red>
<!-- div가 하나 일 때는 tag/id => id를 부여하는게 더 좋음 -->
<!-- div가 여러개 일 때는 id -->
<!-- 좋은코드 : 언제나 변경할 수 있고, 확장할 수 있고, 삭제/추가되도 문제가 없도록 -->
   <div id=result1> 결과가 나타나는 부분 </div>
  </body>
</html>