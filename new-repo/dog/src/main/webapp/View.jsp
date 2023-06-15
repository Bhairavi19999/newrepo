<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center><h3>Passenger List</h3></center>
	<table border="2" cellpadding="10" style="width:100%">
		<tr>
		<th>First name</th>
		<th>Last name</th>
		<th>Age</th>
		<th>Mobile no</th>
		<th>Country</th>
		<th>Address</th>
		<th>File</th>
		</tr>
<c:forEach items="${list}" var="dto" >
		<tr>
		<td>${dto.fname}</td>
		<td>${dto.lname}</td>
		<td>${dto.age}</td>
		<td>${dto.mobile}</td>
		<td>${dto.country}</td>
		<td>${dto.address}</td>
		<td><a target="_blank" href="showFile?fileName=${dto.fileName}&contentType=${dto.contentType}">${dto.originalFileName}</a></td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>