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
String s=(String)request.getAttribute("msg");
if(s!=null)
	out.print(s);
%>
<form action="DeleteEmp" method="post">
Enter Emp Id:<input type="text" name="eid" required placeholder="Enter EmpId"><br>
<input type="submit" value="search">
</form>

</body>
</html>