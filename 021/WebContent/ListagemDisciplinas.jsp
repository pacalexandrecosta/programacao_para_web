<%@page import="nassau.DAO.DisciplinaDAO"%>
<%@page import="nassau.model.Disciplina"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Disciplina> disciplinas = new DisciplinaDAO().getDisciplinas();
	%>
	<form action="Disciplinas.jsp" method="get">
		<select name="semestre">
			<%
				for (Disciplina d : disciplinas) {
			%>
			<option value="<%d.getId();%>">
				<%=d.getTitulo()%>
			</option>
			<%
				}
			%>
		</select>
	</form>
</html>