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
<h1>問題の変更・削除</h1>
<br>

<p class="font2">表示されている日記：<%=list.size()%>件</p>
<br>
<br>

<form>
<center>
<table border="0" cellpadding="0">
   <tbody>
      <% for(int i=0;i<list.size();i++){ %>
       <%Question question = (Question)list.get(i);%>
        <tr>
         <td><a href="./QuestionDisplayServlet?id=<%=question.getId()%>"></a></td>
        </tr>
      <% } %>
   </tbody>
</table>
</center>
</form>
</body>
</html>