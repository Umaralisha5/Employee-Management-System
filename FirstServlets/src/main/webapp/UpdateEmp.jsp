<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method ="post" action="UpdateEmp">
   <table>
      <tr>
         <td>EmpId:</td>
         <td><input type="text" name="eid" value=<%=request.getAttribute("id") %>>
      </td>
      </tr>
      
      <tr>
         <td>EmpName:</td>
         <td><input type="text" name="ename" value=<%=request.getAttribute("name") %> >
      </td>
      </tr>
      
      <tr>
         <td>EmpSalary:</td>
         <td><input type="text" name="salary" value=<%=request.getAttribute("salary") %> >
      </td>
      </tr>
    </table>
    
    <input type="submit" value="save"/>
</form>
</body>
</html>