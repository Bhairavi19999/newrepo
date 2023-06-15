<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SHOWROOM BILL</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="Display.jsp">Home</a>
        </li>
        
       
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <span class="navbar-text">
    </span>
  </div>
</nav>
	<h1>ShowRoom Bill</h1>
	<h2 style="color:green;">${mesg}</h2>
	
	<c:forEach items="${errors}" var="error"> 
<h5 style="color:red;">${error.getField()} ${error.defaultMessage}</h5><br/>
</c:forEach>
	<form action="save" method="post" enctype="multipart/form-data">
		<pre>
		<div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">Customer Name</label>
  <input type="text" class="form-control" id="formGroupExampleInput" placeholder="customerName" value="${dto.customerName }">
<div class="mb-3">
  <label for="formGroupExampleInput2" class="form-label">showroomName</label>
  <input type="text" class="form-control" id="formGroupExampleInput2" placeholder="Another input placeholder">
</div>
	
	Show Room Name:<input type="text" name="showroomName"
				value="${dto.showroomName }"><div>
        Contact Number:<input type="text" name="contactno"
				value="${dto.contactno }"><div>	
        Brand:<select name="carBrand" aria-label="Default select example">
		<option value="${dto.carBrand }">Select</option>
		<option value="${dto.carBrand }">Honda</option>
		<option value="${dto.carBrand }">Ford</option>
		<option value="${dto.carBrand }">Toyota</option>
		<option value="${dto.carBrand }">Audi</option>
		<option value="${dto.carBrand }">Kia</option>
		</select><div>
	Color:<input type="text" name="color" value="${dto.color }"><div>
	Warranty:<input type="number" name="warranty" value="${dto.warranty }"><div>
	Price:<input type="number" name="price" value="${dto.price }"><div>	
	Show Room Address:<input type="text" name="address"
				value="${dto.address }"><div>	
	Select File:<input type="file" name="file" /><div>
				   <input type="submit" value="save" />																	
		</pre>
	</form>
</body>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</html>