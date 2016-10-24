<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<h3>Escolha</h3>
	<form method="get" action="Opcoes.jsp">
		<input type="checkbox" name="autor" value="Machado de Assis">Machado de Assis 
		<br><input type="checkbox" name="autor" value="José de Alencar">José de Alencar 
		<br><input type="checkbox" name="autor" value="Mário Quintana">Mário Quintana 
		<br><input type="submit" value="Query">
	</form>

	<%
		String[] autores = request.getParameterValues("autor");
		if (autores != null) {
	%>
	<h3>Você selecionou o(s) seguinte(s) autor(es):</h3>
	<ul>
		<%
			for (int i = 0; i < autores.length; ++i) {
		%>
		<li><%=autores[i]%></li>
		<%
			}
		%>
	</ul>
	<a href="<%=request.getRequestURI()%>">BACK</a>
	<%
		}
	%>
</body>
</html>