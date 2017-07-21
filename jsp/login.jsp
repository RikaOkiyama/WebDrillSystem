<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>

<title>Web Drill System</title>
<style type ="text/css">
</style>
</head>
<body bgcolor="#ccffff">
<body background="moon.jpg">

<SCRIPT language="JavaScript">
</SCRIPT>
<br>
<br>
<br>
<div align="center">
<font color=white size="7"  >＊Web Drill System Login＊</font>
<br>
<br>
<br>
<br>
<br>

<FORM method="POST" action="./LoginServlet">
<CENTER>
<TABLE border="2" width="600" cellpadding="0">
   <TBODY>
      <TR>
         <TD><FONT color=white><B>ID</B></FONT></TD>
         <TD><INPUT size="50" type="text" name="id"></TD>
      </TR>
      <TR>
         <TD><FONT color=white><B>Password</B></FONT></TD>
         <TD><INPUT size="40" type="password" name="password"></TD>
      </TR>
   </TBODY>
</TABLE>
</CENTER>
<INPUT type="submit" value = "Login">
<INPUT type="submit" value = "SignUp">
</FORM>

</body>
</html>