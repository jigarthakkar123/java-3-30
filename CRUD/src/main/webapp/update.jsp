<%@page import="com.bean.Emp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<style type="text/css">
tr,td{
	padding: 10px;
}
</style>
</head>
<body>
<%
	Emp e=(Emp)request.getAttribute("e");
	if(request.getAttribute("msg")!=null)
	{
		out.println("<b style=color:blue;>"+request.getAttribute("msg")+"</style></b>");
	}
%>
<form name="insert" method="post" action="EmpController">
	<table>
		<tr>
			<td><input type="hidden" name="id" value="<%=e.getId()%>">
		</tr>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" value="<%=e.getFname()%>"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname" value="<%=e.getLname()%>"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="<%=e.getEmail()%>"></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><input type="text" name="mobile" value="<%=e.getMobile()%>"></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>
				<%
					if(e.getGender().equals("male"))
					{
				%>
						<input type="radio" name="gender" value="male" checked="checked">Male
						<input type="radio" name="gender" value="female">Female
				<%		
					}
					else
					{
				%>
						<input type="radio" name="gender" value="male">Male
						<input type="radio" name="gender" value="female" checked="checked">Female
				<%		
					}
				%>
				
			</td>
		</tr>
		<tr>
			<td>Address</td>
			<td><textarea rows="5" cols="22" name="address"><%=e.getAddress()%></textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="action" value="Update" class="btn btn-primary">
			</td>
		</tr>
	</table>
</form>
</body>
</html>