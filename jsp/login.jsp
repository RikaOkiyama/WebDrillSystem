<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>ログインページ</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
</head>
<body background="book.jpg">
<br>

<div align="center">
  <div class="panel-in">
    <div class="panel-bg"></div>
    <div class="panel-main">
    
		<h1>＊Web Drill System＊</h1>
		<br>
		<br>
		<br>

		<form method="POST" action="./LoginServlet">
		<center>
		<table border="2"　bordercolor=#FFFFE0 width="800">
		   <tbody>
 		     <tr>
 		        <td><p class="font2">　　　  ID</p></td>
 		        <td><input size="60" type="text" name="id" maxlength="16"></td>
 		     </tr>
 		        <td><p class="font2">　PASSWORD</p></td>
 		        <td><input size="60" type="password" name="password" maxlength="16"></td>
 		     </tr>
 		  </tbody>
		</table>
		</center>
		<br>
		<input class="submit_button" type="submit" value="ログイン">
		</form>
		<br>
		<a href="./student/createStudent.jsp">
		<input class="submit_button" type="submit" value="新規登録">
		</a>
  </div>
 </div>
</div>
</body>
</html>