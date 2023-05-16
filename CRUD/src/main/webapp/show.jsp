<%@page import="com.dao.EmpDao"%>
<%@page import="com.bean.Emp"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<table border="5" width="100%" cellpadding="10px" cellspacing="10px">
	<tr>
		<th>ID</th>
		<th>FIRST NAME</th>
		<th>LAST NAME</th>
		<th>EMAIL</th>
		<th>MOBILE</th>
		<th>ADDRESS</th>
		<th>GENDER</th>
		<th>EDIT</th>
		<th>DELETE</th>
	</tr>
	<%
		List<Emp> list=EmpDao.getAllEmp();
		for(Emp e:list)
		{
	%>
	<tr>
		<td><%=e.getId() %></td>
		<td><%=e.getFname() %></td>
		<td><%=e.getLname() %></td>
		<td><%=e.getEmail() %></td>
		<td><%=e.getMobile() %></td>
		<td><%=e.getAddress() %></td>
		<td><%=e.getGender() %></td>
		<td>
			<form name="edit" method="post" action="EmpController">
				<input type="hidden" name="id" value="<%=e.getId()%>">
				<input type="submit" name="action" value="EDIT" class="btn btn-primary">
			</form>
		</td>
		<td>
			<form name="delete" method="post" action="EmpController">
				<input type="hidden" name="id" value="<%=e.getId()%>">
				<input type="submit" name="action" value="DELETE" class="btn btn-danger">
			</form>
		</td>
	</tr>
	<%		
		}
	%>
</table>
</body>
</html>