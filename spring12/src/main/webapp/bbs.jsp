<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  게시판 :)
  <hr>
    <form action = "bbs2.mega"> 
    	id : <input name="id"> <br>
		title : <input name="title"> <br>
  	 	content : <input name="content"> <br>
 	    writer : <input name="writer"> <br>
    <button>글쓰기요청</button>
   </form>
   <br><br><br>
   <form action = "bfid.mega"> 
  	  writer : <input name="writer"> <br>
    <button> 작성자 검색 요청</button>
   </form>

</body>
</html>