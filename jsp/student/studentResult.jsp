<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import= "beans.Question" %>
<%@ page import= "beans.Result" %>
<%@ page import= "java.util.ArrayList" %>
<%
ArrayList list =  (ArrayList)request.getAttribute("resultList");
%>
<%
	Question question =  (Question)request.getAttribute("question");
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>履歴</title>
<link rel="stylesheet" type="text/css" href="/webDrill/jsp/css/main.css" media="all">
</head>
<body background="/webDrill/jsp/book.jpg">
</body>

<div align="center">
  <div class="panel-in">
    <div class="panel-bg"></div>
    <div class="panel-main">

<br>
<form>
<h1>解答履歴</h1>
<br>
	<c:forEach items="${result}" var="list">
	<p class="font2">
	(解答者) ${list.userId}
	　(答え) ${list.answer}
	　(解答者の答え) ${list.result}
	</p>
	</c:forEach>
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