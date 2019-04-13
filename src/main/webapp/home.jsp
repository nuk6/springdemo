<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
input{
	padding : 5px;
	border-radius: 5px;
}
</style>
<body>
	<form action="addAlien">
		<input name="aid" type="text"/>
		<input name="aname" type="text"/>
		<input type="submit"> 
	</form>
	<br>
	<form action="getAlien">
		<input name="aid" type="text" placeholder="ID"/>
		<input type="submit"/>
	</form>
</body>
</html>