<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CHRIST</title>
</head>
<body>
<form action="/FirstSpringMVCProject/studentDetails" method="post">
	<div><h1>${message1}</h1></div>
	<form:errors path="studentDetails.*"/>
	<div>
		<table>
			<tr>
				<td>Name :</td><td> <input type="text" name="name"></td>
			</tr>
			
			<tr>
				<td>Qualification :</td><td>  <input type="text" name="qualification"></td>
			</tr>
			<tr>
				<td>E-mail :</td><td> <input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Contact No. : </td><td><input type="text" name="mobileNo"></td>
			</tr>
			<tr>
				<td>Date of Birth :</td><td><input type="text" name="dob"></td>
			</tr>
			<tr>
				<td>Skills :</td><td> <select name="skills" multiple="multiple">
										<option value="Core Java">core java</option>
										<option value="Struts">Struts</option>
										<option value="Spring">Spring</option>
										</select>
								</td>
			</tr>
			<tr>
				<td>Address</td><td>
									<div>City    : &nbsp;&nbsp;<input type="text" name="address.city"></div>
									<div>State   : &nbsp;&nbsp;<input type="text" name="address.state"></div>
									<div>Country : &nbsp;&nbsp;<input type="text" name="address.country"></div>
									<div>PIN     : &nbsp;&nbsp;<input type="text" name="address.pin"></div>
								</td>
			</tr>
		</table>
	</div>
	
	<div>
		<input type="submit" value="Submit Details"/>
	</div>

</form>
</body>
</html>