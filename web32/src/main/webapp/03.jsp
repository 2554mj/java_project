<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
$(function() {

	$('#b3').click(function() {
		contentValue = $('#content').val()
		result1Tag = $('#result1')
		
		result1Tag.append(contentValue+'<br>')
	});	
	
});
</script>
  </head>
  <body>
  댓글입력 : <input id='content'>
  <button id=b3> 댓글달기 </button><br>
  <hr color=red>
   <div id=result1> </div>
  </body>
</html>