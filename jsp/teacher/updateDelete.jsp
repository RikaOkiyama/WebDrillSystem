<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>問題の編集と削除</title>
<link rel="stylesheet" type="text/css" href="/webDrill/jsp/css/main.css">
</head>
<body background="/webDrill/jsp/book.jpg">
<br>
<div align="center">
  <div class="panel-in">
    <div class="panel-bg"></div>
    <div class="panel-main">
    
		<h1>問題の編集と削除</h1>
		<br>
		<form action="/webDrill/UpdataQuestionServlet" method="post">
		<center>
		<table border="2" bordercolor=#FFFFE0 width="800">
		   <tbody>
 		     <tr>
 		        <td><p class="font2">　  問題</p></td>
 		        <td><textarea name="question" cols="60" rows="5" maxlength="128"></textarea></td>
 		     </tr>
 		        <td><p class="font2">　  答え</p></td>
 		        <td><input size="60" type="text" name="answer"　maxlength="16"></td>
 		     </tr>
 		  </tbody>
		</table>
		</center>
		<br>
		<input class="submit_button" type="submit" value="再登録">
		</form>
		<br>
		<a href="/updateQuestionServlet">
      	<input class="submit_button" type="submit" value="削除">
      	</a>
		</div>
	</div>
</div>

</body>
</html>