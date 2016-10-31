<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="nassau.model.Aluno"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="aluno" class="nassau.model.Aluno" 
	scope="request" />

	Detalhes
	<table>
		<tr>
			<td>Id</td>
			<td>${aluno.id}</td>
		</tr>
		<tr>
			<td>Nome</td>
			<td>${aluno.nome}</td>
		</tr>
	</table>
	<a href=Aluno>Voltar</a>
</body>
</html>