<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page import="nassau.util.Acoes"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="aluno" class="nassau.model.Aluno" 
	scope="request" />

	<form action="Aluno" method="post">

		Insira o nome do aluno: 
		<input type="text" name="nome" value="${aluno.nome}">
		<input type="submit"> 
		
		<input type="hidden" name="id" value="${aluno.id}"> 
		<input type="hidden" name="acao" value="${param.acao}" />
	</form>
	<a href=Aluno>Voltar</a>

</body>
</html>