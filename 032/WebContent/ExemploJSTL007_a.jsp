<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="ExemploJSTL007_b.jsp">
		Escolha a sua forma de ingresso: 
		<br> <input type="radio" name="ingresso" value="visitante">Não sou membro
		<br> <input type="radio" name="ingresso" value="membro">Sou membro 
		<br> <input type="submit">
	</form>

</body>
</html>