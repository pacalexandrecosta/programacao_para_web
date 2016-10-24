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

	A aplica��o foi acessada <%=acessoGeral%> vezes;


	<%
		String penultimoAcesso = "";
		String ultimoAcesso = new Date().toString().replace(" ", "_");
		if (request.getCookies() != null) {
			for (Cookie c : request.getCookies()) {
				if (c.getName().equals("ultimoAcesso")) {
					penultimoAcesso = c.getValue();
				}
			}
		}
		Cookie cookie = new Cookie("ultimoAcesso", ultimoAcesso);
		cookie.setMaxAge(10 * 60);
		response.addCookie(cookie);
	%>

	<%
		if (penultimoAcesso.equals("")) {
	%>
	<h4>Seja bem vindo!</h4>
	<%
		} else {
	%>
	<h6>
		O seu �ltimo acesso havia sido em
		<%=penultimoAcesso%></h6>
	<%
		}
	%>
<%@ page import="java.util.Date"%>

</body>
</html>