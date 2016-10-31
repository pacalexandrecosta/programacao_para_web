<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="nassau.Aluno"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		List<Aluno> alunos = (List<Aluno>)
		request.getAttribute("alunos");
	%>

	Eis o resultado da consulta:
	<br>
	<ol>
		<%
			for (Aluno a : alunos) {
		%>
		<li><%=a.getNome()%></li>
		<%
			}
		%>
	</ol>
	<a href="PesquisaPorNome.jsp">Fazer nova pesquisa</a>
</body>
</html>