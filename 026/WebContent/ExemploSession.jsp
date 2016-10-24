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
		Object acessoGeralObj = application.getAttribute("acessoGeral");
		int acessoGeral = 0;
		if (acessoGeralObj != null)
			acessoGeral = Integer.parseInt(acessoGeralObj.toString());
		acessoGeral++;
		application.setAttribute("acessoGeral", acessoGeral);
	%>

	A aplicação foi acessada <%=acessoGeral%> vezes;

	<%
		if (session.isNew()) {
	%>
	<h1>Você é novo por aqui!!</h1>
	<%
		} else {
	%>
	<h2>Você já esteve aqui!</h2>
	<%
		}
	%>
</body>
</html>