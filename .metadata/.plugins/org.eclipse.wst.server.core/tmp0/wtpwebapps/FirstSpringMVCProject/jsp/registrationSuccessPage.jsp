<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CHRIST</title>
</head>
<body>
	<div><h1>${message1}</h1></div>
	<div><h2>${message2}</h2></div>
	<div><h3>Name : ${studentDetails.name}</h3></div>
	<div><h3>Qualification : ${studentDetails.qualification}</h3></div>
	<div><h3>Email : ${studentDetails.email}</h3></div>
	<div><h3>Contact No. : ${studentDetails.mobileNo}</h3></div>
	<div><h3>DOB : ${studentDetails.dob}</h3></div>
	<div><h3>Skills : ${studentDetails.skills}</h3></div>
	<div><h3>Address : ${studentDetails.address.city},${studentDetails.address.state},${studentDetails.address.country},${studentDetails.address.pin}</h3></div>
</body>
</html>