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
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: pink;">
		<div>
			<a style="margin-left: 40px; color: yellow; margin-left: 40px;"
				href="Account.jsp ">Home</a><br> <a
				style="color: yellow; margin-left: 100px" href="view">Information
				Table</a>
		</div>
	</nav>
	<h1 style="color: blue; text-align: center">INFORMATION...</h1>
	<br>
	<h2 style="color: green; text-align: center">${mesg}</h2>
	<br>
	<pre style="text-align: center">
	Name:${dtos.name }
	Email:${dtos.email}
	Contact No:${dtos.contactNo }
	Comments:${dtos.comments}
	</pre>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</html>