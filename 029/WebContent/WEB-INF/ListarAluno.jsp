<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="alunos" class="java.util.ArrayList" scope="request"/>
	
	
	
	
	<c:forEach items="${alunos}" var="aluno">
		<ul>
			<li>${aluno.nome}
			<a href=Aluno?acao=Detalhes&id=${aluno.id}>Detalhes</a>
			<a href=Aluno?acao=Atualizar&id=${aluno.id}>Atualizar</a>
			<a href=Aluno?acao=Deletar&id=${aluno.id}>Deletar</a>
			</li>
		</ul>
	</c:forEach>
	<a href =Aluno?acao=Inserir>Inserir Novo Aluno</a>
</body>
</html>