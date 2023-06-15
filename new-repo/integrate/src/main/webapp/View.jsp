<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center><h3>Contact List</h3></center>
	<table border="2" cellpadding="10" style="width:100%">
		<tr>
		<th> Name</th>
		<th> Email</th>
		<th>Contact no</th>
		<th>Comments</th>
		<th>File</th>
		</tr>
<c:forEach items="${list}" var="dto" >
		<tr>
		<td>${dto.name}</td>
		<td>${dto.email}</td>
		<td>${dto.contactNo}</td>
		<td>${dto.comments}</td>
		<td><a target="_blank" href="showFile?fileName=${dto.fileName}&contentType=${dto.contentType}">${dto.originalFileName}</a></td>
		</tr>
		</c:forEach>
	</table>
	

</body>
</html>