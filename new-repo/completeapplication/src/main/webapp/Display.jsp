<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RESPONSE</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-light bg-light">
  <div class="container-fluid">
    <span class="navbar-text">
    </span>
  </div>
</nav>
	<h1>INFORMATION...</h1>
	<span style="color: green;">${mesg}</span>
	
	<pre>
Customer Name:${dtos.customerName }
Show Room Name:${dtos.showroomName }
Contact Number:${dtos.contactno }
Brand:${dtos.carBrand }
Color:${dtos.color }
Warranty:${dtos.warranty }
Price:${dtos.price }
Show Room Address:${dtos.address }
</pre>
</body>
</html>