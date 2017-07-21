<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container col-md-offset-4 col-md-4">
<h1 class="text-center center-block">Student Create !</h1>
<br>
<form action="../CreateStudentServlet" method="post">
  <div class="form-group">
    <label for="user_id">User ID</label>
    <input type="text" class="form-control" id="user_id" name="user_id" placeholder="User ID">
  </div>
  <div class="form-group">
    <label for="password">Password</label>
    <input type="password" class="form-control" id="password" name="password" placeholder="Password">
  </div>
  <br>
  <button type="submit" class="btn btn-primary center-block">Submit</button>
</form>
</div>
</body>
</html>