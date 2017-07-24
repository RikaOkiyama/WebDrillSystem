<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import= "beans.Question" %>
<%@ page import= "beans.Result" %>
<%@ page import= "java.util.ArrayList" %>
<%
ArrayList list =  (ArrayList)request.getAttribute("resultList");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>解答履歴</title>
<link rel="stylesheet" type="text/css" href="/webDrill/jsp/css/main.css" media="all">
</head>
<body background="/webDrill/jsp/book.jpg">
</body>

<div align="center">
  <div class="panel-in">
    <div class="panel-bg"></div>
    <div class="panel-main">
<h1>解答履歴</h1>
<br>

<p class="font2">履歴：<%=list.size()%>件</p>
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
       	<td><a class="link1" href="/webDrill/questionDisplay2?id=<%=question.getId()%>"><%=question.getId()%>：(問題)<%=question.getQuestion()%></a></td>
      </tr>
      <% } %>
   </tbody>
</table>
</form>
<br>
</div>
</div>
</div>
</html>