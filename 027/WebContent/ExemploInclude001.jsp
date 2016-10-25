
<%
	Object acessoGeralObj = application.getAttribute("acessoGeral");
	int acessoGeral = 0;
	if (acessoGeralObj != null)
		acessoGeral = Integer.parseInt(acessoGeralObj.toString());
	acessoGeral++;
	application.setAttribute("acessoGeral", acessoGeral);
%>
<html>
<head>
<title>Eis um exemplo da diretiva include</title>
</head>
<body>
	<center>
		<h2>Exemplo da diretiva include</h2>
		<p>
			Este site foi visitado
			<%=application.getAttribute("acessoGeral").toString()%>
			vezes.
		</p>
	</center>
	<br />
	<br />