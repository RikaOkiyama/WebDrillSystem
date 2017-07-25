<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import= "beans.Question" %>
<%@ page import= "java.util.ArrayList" %>
<%
ArrayList list =  (ArrayList)request.getAttribute("questionList");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>問題選択</title>
<link rel="stylesheet" type="text/css" href="./jsp/css/main.css" media="all">
</head>
<body background="./jsp/book.jpg">
</body>

<div align="center">
  <div class="panel-in">
    <div class="panel-bg"></div>
    <div class="panel-main">
<h1>履歴を表示する問題の選択</h1>
<br>

<p class="font2">表示されている問題：<%=list.size()%>件</p>
<br>
<br>

<form>
<table border="0" cellpadding="0">
	<thead>
		<tr>
			<td/>
		</tr>
	</thead>
   <tbody>
      <% 
      	for(int i=0;i<list.size();i++){
      		Question question = (Question)list.get(i);
      %>
      <tr>
       	<td><a class="link1" href="../../questionDisplay?id=<%=question.getId()%>"><%=question.getId()%>：(問題)<%=question.getQuestion()%>　(答え)<%=question.getAnswer()%></a></td>
      </tr>
      <% } %>
   </tbody>
</table>
</form>
<br>
<a href="../jsp/teacher/teacherTop.jsp" >
      <input class="submit_button" type="submit" value="メニュー画面に戻る">
      </a><br><br>
</div>
</div>
</div>
</html>