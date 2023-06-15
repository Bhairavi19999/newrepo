<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<script>
	function validationForm() {
		var fname = document.getElementById("fname").value;
		var age = document.getElementById("age").value;
		if (fname == "") {
			// 			alert("Enter the Name");
			document.getElementById("fname2").innerHTML = "* Enter the Name";
			return false;
		}
		if (name.length < 3) {
			// 			alert("Name must be at least 3 char");
			document.getElementById("fname2").innerHTML = "* Name should have at least 3 letters";
			return false;
		}
		if (age < 18) {
			// 			alert("Age must be greater than 18");
			document.getElementById("age2").innerHTML = "* Age must be greater than 18";
			return false;
		}
		return true;
	}
</script>

</head>
<body>

	<nav class="navbar navbar-light" style="background-color: maroon;">
		<div>
			<img height="50px"
				src="https://tse4.mm.bing.net/th?id=OIP.8yKNz5Cgix9EMo1I1RENMgHaE7&pid=Api&P=0&h=180">
			<a style="color: yellow; margin-left: 40px;" href="Display.jsp ">Details
			</a> <a style="color: yellow; margin-left: 40px;" href="view">Information
				Table</a>
		</div>
	</nav>
	<h1>
		<center>PASSPORT DETAILS......
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
			<label for="inputCity" class="form-label">FirstName</label> <input
				type="text" class="form-control" name="fname"
				value="${dto.fname }"id="fname" onchange="return validationForm()" /><span
				id="name2" style="color: red"></span> <br>
		</div>

		<div class="col-md-4">
			<label for="inputCity" class="form-label">LastName</label> <input
				type="text" class="form-control" name="lname" value="${dto.lname }"><br>
		</div>

		<div class="col-md-4">
			<label for="inputCity" class="form-label">Age</label> <input
				type="number" class="form-control" name="age" value="${dto.age }"id="age" /><span id="age2"
				style="color: red"></span>
	        <br>
		</div>

		<div class="col-md-4">
			<label for="inputCity" class="form-label">Mobile No</label> <input
				type="text" class="form-control" name="mobile"
				value="${dto.mobile }"><br>
		</div>
		<div class="col-md-4">
			<label for="inputState" class="form-label">Country</label> <select
				id="inputState" class="form-select" name="country"
				value="${dto.country }"><br>
				<option selected>Choose...</option>

				<option>India</option>
				<option>America</option>
				<option>Singapor</option>
				<option>Russia</option>
				<option>Londan</option></select><br>
		</div>

		<div class="col-md-4">
			<label for="inputAddress" class="form-label">Address</label> <input
				type="text" class="form-control" name="address"
				value="${dto.address }"><br>
			<br>
		</div>
		Select File<input type="file" name="file"><br> <br>
		<input type="submit" value="submit">
	</form>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</html>