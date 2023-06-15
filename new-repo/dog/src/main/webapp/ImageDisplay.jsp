<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IMAGE</title>
</head>
<body>
<a href="Passport.jsp">HOME</a>
<h1>IMAGE PAGE....</h1>
<form action="fileDownload" method="get">
File Name:<input type="text" name="fileName"/>
Content Type:<input type="text" name="contentType"/>
<input type="submit" value="Download">
</form>
</body>
</html>