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
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		if (senha == null || senha.length() < 5) {
			request.setAttribute("nome", nome);
	%>

	<form>
		<%
			if (nome == null) {
					nome = "";
				} else {
		%>
		Crie uma senha forte com mais de 5 dígitos.
		<%
			}
		%>
		<br> Nome <input type="text" name="nome" value=<%=nome%> > 
		<br> Crie uma Senha <input type="password"> 
		<br> <input type="submit">
	</form>
	<%
		} else {
	%>
	<h1>
		Seja bem vindo<%=nome%></h1>
	<%
		}
	%>


</body>
</html>