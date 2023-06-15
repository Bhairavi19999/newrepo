<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	background-color: white
}
</style>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#">Navbar</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="Display.jsp ">Home</a></li>
				</ul>
				<div>
				<a href="ImageDisplay.jsp">View Page</a></div>
				<form class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>
				</form>
			</div>
		</div>
	</nav>
	<h1>PASSPORT......</h1>
	<h2 style="color: green;">${mesg}</h2>
	<c:forEach items="${errors}" var="error">
		<h5 style="color: red;">${error.getField()}
			${error.defaultMessage}</h5>
		<br />
	</c:forEach>
	<form method="post" action="save" enctype="multipart/form-data">
		FirstName:<input type="text" name="fname" value="${dto.fname }"><br>
		<br> LastName:<input type="text" name="lname"
			value="${dto.lname }"><br>
		<br> Age:<input type="number" name="age" value="${dto.age }"><br>
		<br> Mobile No:<input type="text" name="mobile"
			value="${dto.mobile }"><br>
		<br> Country:<select name="country">
			<option value="${dto.country }">Select</option>
			<option value="${dto.country }">India</option>
			<option value="${dto.country }">America</option>
			<option value="${dto.country }">Singapor</option>
			<option value="${dto.country }">Russia</option>
			<option value="${dto.country }">Londan</option>
		</select><br>
		<br> Address:<input type="text" name="address"
			value="${dto.address }"><br>
		<br> Select File<input type="file" name="file"><br>
		<br> <input type="submit" value="submit">
	</form>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</html>