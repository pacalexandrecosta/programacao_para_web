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

	<jsp:useBean id="editoras" class="java.util.ArrayList" scope="request" />

	<c:if test="${empty editoras}">
		<jsp:forward page="Editora"></jsp:forward>
	</c:if>
	<ul>
		<c:forEach items="${editoras}" var="editora">
			<li>Nome da Editora: ${editora.nome} <br>Livros
				<ul>
					<c:forEach items="${editora.livros}" var="livro">
						<li>${livro.titulo}</li>
					</c:forEach>
				</ul>
			</li>
		</c:forEach>
	</ul>
</body>
</html>