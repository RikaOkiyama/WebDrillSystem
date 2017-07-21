<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<title>Web Drill Systemにようこそ！</title>
<link rel="stylesheet" type="text/css" href="../css/main.css" media="all">
</head>
<body background="../book.jpg">
</body>

<br>
<br>
<br>
<div align="center">
  <div class="panel-in">
    <div class="panel-bg"></div>
    <div class="panel-main">
<h1>Web Drill Systemにようこそ！</h1>
<br>
<br>
<br>
      <a href="./createQuestion.jsp" >
      <input class="submit_button" type="submit" value="問題の登録">
      </a><br>
      <br>
      <a href="./GetQuestionServlet">
      <input class="submit_button" type="submit" value="問題の編集と削除">
      </a><br>
      <br>
      <a href="./LogoutServlet">
	  <input class="submit_button" type="submit" value=" ログアウト ">
	  </a><br>
    </div>
  </div>
</div>
<br>
<br>
</body>
</html>