<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="livro" class="nassau.model.Livro" scope="request" />

	Detalhes do livro:
	<br> Id: ${livro.id}
	<br> Título: ${livro.titulo}
	<br> Descricao: ${livro.descricao}
	<br> Autor: ${livro.autor}
	<br>


	<a href="Livro">Voltar</a>

</body>
</html>