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
	int acessos=0;
		Object acessoObj = session.getAttribute("acessos");
		if (acessoObj == null)
			acessos=1;
		else {
			acessos = Integer.parseInt(acessoObj.toString());
			acessos++;
		}
		session.setAttribute("acessos", acessos);
	%>
	
	Você já acessou esta página <%= acessos %>
</body>
</html>