<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <font size="30px">
	<b><a href="https://www.google.com">Google</a></b>
</font>
<br>
<img src="images/1.jpg" width="100px" height="100px">
 -->
 <form name="frm" method="post" action="">
 	<table cellpadding="3px" cellspacing="3px">
 		<tr>
 			<td>First Name</td>
 			<td><input type="text" name="fname" onblur="checkFname();"></td>
 			<td><span id="fname"></span></td>
 		</tr>
 		<tr>
 			<td>Last Name</td>
 			<td><input type="text" name="lname"></td>
 			
 		</tr>
 		<tr>
 			<td>Email</td>
 			<td><input type="text" name="email" onblur="checkEmail();"></td>
 			<td><span id="email"></span></td>
 		</tr>
 		<tr>
 			<td>Mobile</td>
 			<td><input type="text" name="mobile" onblur="checkMobile();"></td>
 			<td><span id="mobile"></span></td>
 		</tr>
 		<tr>
 			<td>Address</td>
 			<td><textarea rows="5" cols="21" name="address"></textarea></td>
 		</tr>
 		<tr>
 			<td>Gender</td>
 			<td>
 				<input type="radio" name="gender" value="male">Male
 				<input type="radio" name="gender" value="female">Female
 			</td>
 		</tr>
 		<tr>
 			<td>Hobby</td>
 			<td>
 				<input type="checkbox" name="hobby" value="music">Music<br>
 				<input type="checkbox" name="hobby" value="reading">Reading<br>
 				<input type="checkbox" name="hobby" value="traveling">Traveling<br>
 				<input type="checkbox" name="hobby" value="cricket">Cricket
 			</td>
 		</tr>
 		<tr>
 			<td>Education</td>
 			<td>
 				<select name="education">
 					<option>---Select Education---</option>
 					<option value="10th">10th</option>
 					<option value="10th">12th</option>
 					<option value="10th">BE</option>
 					<option value="10th">BCA</option>
 					<option value="10th">BBA</option>
 					<option value="10th">ME</option>
 					<option value="10th">MCA</option>
 					<option value="10th">MBA</option>
 				</select>
 			</td>
 		</tr>
 		<tr>
 			<td>Birth Date</td>
 			<td><input type="date" name="birthdate"></td>
 		</tr>
 		<tr>
 			<td>Birth Time</td>
 			<td><input type="time" name="birthtime"></td>
 		</tr>
 		<tr>
 			<td>Resume</td>
 			<td><input type="file" name="resume"></td>
 		</tr>
 		<tr>
 			<td>Password</td>
 			<td><input type="password" name="password" onblur="checkPassword();"></td>
 			<td><span id="password"></span></td>
 		</tr>
 		<tr>
 			<td>Confirm Password</td>
 			<td><input type="password" name="cpassword" onblur="checkCPassword();"></td>
 			<td><span id="cpassword"></span></td>
 		</tr>
 		<tr>
 			<td colspan="2" align="center">
 				<input type="submit" name="action" value="SUBMIT" class="btn btn-link">
 			</td>
 		</tr>
 	</table>
 </form>
 <div class="spinner-grow text-primary" role="status">
  <span class="visually-hidden">Loading...</span>
</div>
<div class="spinner-grow text-secondary" role="status">
  <span class="visually-hidden">Loading...</span>
</div>
<div class="spinner-grow text-success" role="status">
  <span class="visually-hidden">Loading...</span>
</div>
<div class="spinner-grow text-danger" role="status">
  <span class="visually-hidden">Loading...</span>
</div>
<div class="spinner-grow text-warning" role="status">
  <span class="visually-hidden">Loading...</span>
</div>
<div class="spinner-grow text-info" role="status">
  <span class="visually-hidden">Loading...</span>
</div>
<div class="spinner-grow text-light" role="status">
  <span class="visually-hidden">Loading...</span>
</div>
<div class="spinner-grow text-dark" role="status">
  <span class="visually-hidden">Loading...</span>
</div>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
 <script src="js/validation.js">
 	
 </script>
</body>
</html>