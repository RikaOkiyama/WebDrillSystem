<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import= "beans.Question" %>
<%@ page import= "java.util.ArrayList" %>
<%
	Question question =  (Question)request.getAttribute("question");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>問題選択</title>
<link rel="stylesheet" type="text/css" href="/webDrill/jsp/css/main.css" media="all">
</head>
<body background="/webDrill/jsp/book.jpg">
</body>

<div align="center">
  <div class="panel-in">
    <div class="panel-bg"></div>
    <div class="panel-main">
<h1><%=question.getId()%>: <%=question.getQuestion()%></h1>
<br>
<form action="/webDrill/student/CreateResult" method="post">
		<center>
		   <tbody>
		     <tr>
 		        <td><p class="font2">答え</p></td>
 		        <td><input size="60" type="text" name="answer"　maxlength="16"></td>
 		     </tr>
 		  </tbody>
		</center>
		<br>
		
		<input type="hidden" name="questionId" value="<%=question.getId()%>">
		<input class="submit_button" type="submit" value="解答する">
		</form>
		<br>
		<a href="/webDrill/jsp/student/studentTop.jsp" >
     	 <input class="submit_button" type="submit" value="メニュー画面に戻る">
      	</a><br><br>
		</div>
	</div>
</div>
</body>
</html>