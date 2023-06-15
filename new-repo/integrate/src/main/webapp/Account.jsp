<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ACCOUNT</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
<script>
	function validationForm() {
		var name = document.getElementById("name").value;
		
		if (name == "") {
			// 			alert("Enter the Name");
			document.getElementById("name2").innerHTML = "* Enter the Name";
			return false;
		}
		if (name.length < 3) {
			// 			alert("Name must be at least 3 char");
			document.getElementById("name2").innerHTML = "* Name should have at least 3 letters";
			return false;
			</script>	
</head>
<body>
	<nav class="navbar navbar-light" style="background-color: maroon;">
		<div>

			<a style="color: yellow; margin-left: 40px;" href="Display.jsp ">Details
			</a> <a style="color: yellow; margin-left: 40px;" href="view">Information
				Table</a>
		</div>
	</nav>
	<h1>
		<center>Contact Form
	</h1>
	</center>
	<h2 style="color: green;">${mesg}</h2>
	<c:forEach items="${errors}" var="error">
		<h5 style="color: red;">${error.getField()}
			${error.defaultMessage}</h5>
		<br />
	</c:forEach>
	<form method="post" action="save" enctype="multipart/form-data"
		style="border: solid 4px; margin-left: 400px; margin-right: 400px">
		<div class="col-md-4">
			<label for="inputCity" class="form-label">Name</label> <input
				type="text" class="form-control" name="name" value="${dto.name }"
				id="name" onchange="return validationForm()" /><span id="name2"
				style="color: red"></span> <br>
		</div>

		<div class="col-md-4">
			<label for="inputCity" class="form-label">Email</label> <input
				type="text" class="form-control" name="email" value="${dto.email }"><br>
		</div>
		
		<div class="col-md-4">
			<label for="inputCity" class="form-label">Contact Number</label> <input
				type="number" class="form-control" name="contactNo" value="${dto.contactNo }"><br>
		</div>
		<div class="col-md-4">
			<label for="inputCity" class="form-label">Comment</label> <input
				type="text" class="form-control" name="comments" value="${dto.comments }"><br>
		</div>
		
	Select File<input type="file" name="file"><br> <br>
		<input type="submit" value="submit">
	</form>
</body>
<script>
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</html>