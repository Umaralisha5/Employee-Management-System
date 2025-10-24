<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegistrationPage</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>
<h2 style="text-align:center;">please provide your Details</h2>
<form  method="post" action="Registration">
	<table align="center">
		<tr>
			<td>FirstName:</td>
			<td><input type="text" name="fname" required placeholder="EnterFirstName"/>	</td>
	</tr>
		<tr>
			<td>LastName:</td>
			<td><input type="text" name="lname" required placeholder="EnterLastName"/>		</td>
		</tr>
		<tr>
			<td>UserName:</td>
			<td><input type="text" id="uname" name="uname" required placeholder="EnterUserName"  />		</td>
		</tr>
		
		<tr>
			<td>Password:</td>
			<td><input type="password" id="pwd" name="pwd" value="" required placeholder="Enter Password"  />		</td>
		</tr>
		<tr>
			<td>Email Id:</td>
			<td><input type="email" name="email" required placeholder="Enter Email Id"/></td>
			
		</tr>
		<tr>
			<td>Phone:</td>
			<td><input type="number" name="phone" id="phone" required placeholder="Enter Phone Number" onblur="phvalidate();"/></td>
			<td><div id="ph"></div></td>
		</tr>	
    <tr><td><input type="submit" value="Register" /></td></tr>
    </table>
</form>

</body>
</html>