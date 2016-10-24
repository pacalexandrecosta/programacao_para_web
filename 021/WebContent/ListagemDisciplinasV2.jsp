<%@page import="nassau.DAO.DisciplinaDAO"%>
<%@page import="nassau.model.Disciplina"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="disciplinaDAO" class="nassau.DAO.DisciplinaDAO" />
	<form action="Disciplinas.jsp" method="get">
		<select name="semestre">
			<c:forEach var="disciplina" items="${disciplinaDAO.disciplinas}">
				<option value=${disciplina.id}>${disciplina.titulo}</option>
			</c:forEach>
		</select>
	</form>

</body>
</html>