<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
String val=(String)request.getAttribute("msg");
if(val!=null)
	out.print("<h3 style='colour:red;text-align center;'>"+val);
%>
<h2 style='colour:darkblue;text-align:center;'>Welcome to Employe Management System</h2>
<h3><table align="center">
</h3>
<form method="post" action="LoginServlet">
   <tr> <td>Username: <input type="text" name="username" required placeholder="Enter Username"/></td></tr> <br/><br>
    <tr><td>Password: <input type="password" name="password" required placeholder="Enter Password"/> </td></tr><br/>
    <tr><td><button type="submit">Login</button></td></tr><br>
  <tr><td><a href="Registration.jsp">Are you NewUser? Create an account</a>  </td></tr>
</form>
</table>

</body>
</html>