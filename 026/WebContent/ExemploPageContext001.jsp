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
  pageContext.setAttribute("ip", "127.0.0.1", PageContext.REQUEST_SCOPE);
  pageContext.setAttribute("nomeBanco", "nassau", PageContext.REQUEST_SCOPE);
  request.setAttribute("senha", "123456");
%>

Recuperando os atributos e variáveis
<br> Ip do Banco
<%=pageContext.getAttribute("ip", PageContext.REQUEST_SCOPE)%>

<br> Nome do Banco
<%=request.getAttribute("nomeBanco")%>

<br> Senha do Banco
<%=pageContext.getAttribute("senha", PageContext.REQUEST_SCOPE)%>



</body>
</html>