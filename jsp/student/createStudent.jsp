<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>新規登録</title>
<link rel="stylesheet" type="text/css" href="../css/main.css">
</head>
<body background="../book.jpg">
<br>

<div align="center">
  <div class="panel-in">
    <div class="panel-bg"></div>
    <div class="panel-main">
    
		<h1>新規登録</h1>
		<br>
		<form action="../CreateStudentServlet" method="post">
		<center>
		<table border="2" bordercolor=#FFFFE0 width="800">
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
		<input class="submit_button" type="submit" value="登録">
		</form><br>
		 <a href="/webDrill/jsp/login.jsp" >
      <input class="submit_button" type="submit" value="ログイン画面に戻る">
      </a><br><br>
		</div>
	</div>
</div>

</body>
</html>