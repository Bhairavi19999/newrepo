<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<style type="text/css">
form {
	background-color: pink
}
</style>
</head>
<body>
	<nav class="navbar navbar-light bg-light"
		style="backgroung-color: blue">
		<div class="container-fluid">

			<a href="Passport.jsp ">Home</a>
		</div>
	</nav>
	<h1 style="color: blue; text-align: center">INFORMATION...</h1>
	<span style="color: green;">${mesg}</span>
	<pre>
	FirstName:${dtos.fname }
	LastName:${dtos.lname }
	Age:${dtos.age }
	Mobile No:${dtos.mobile }
	Country:${dtos.country }
	Address:${dtos.address }
</pre>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</html>