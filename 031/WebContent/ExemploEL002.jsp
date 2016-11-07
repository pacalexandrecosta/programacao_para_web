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

	<jsp:useBean id="livros" class="java.util.ArrayList" scope="request" />

	<c:if test="${empty livros}">
		<jsp:forward page="Livro"></jsp:forward>
	</c:if>
	<ul>
		<c:forEach items="${livros}" var="livro">
			<li>Titulo: ${livro.titulo}<br> Autor: ${livro.autor.nome}
			</li>
		</c:forEach>
	</ul>
</body>
</html>