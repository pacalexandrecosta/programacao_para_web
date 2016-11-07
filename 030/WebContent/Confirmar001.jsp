<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="nassau.model.Livro"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="livro" class="nassau.model.Livro">
		<jsp:setProperty name="livro" property="titulo" param="titulo" />
		<jsp:setProperty name="livro" property="preco"  param="preco" />
	</jsp:useBean>
	Dados do livro: 
	<br> Título:<jsp:getProperty property="titulo" name="livro" />
	<br> Preço:<jsp:getProperty property="preco" name="livro" />
</body>
</html>