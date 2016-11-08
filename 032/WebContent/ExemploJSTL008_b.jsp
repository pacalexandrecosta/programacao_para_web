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
	<c:choose>
		<c:when test="${param.pagamento == 'paypal' }">
			<c:out
				value="Esta forma de pagamento exige que você tenha uma conta do Paypal." />
		</c:when>
		<c:when test="${param.pagamento == 'boleto' }">
			<c:out value="Imprima este boleto e pague-o no Banco do Brasil." />
		</c:when>
		<c:when test="${param.pagamento == 'especie' }">
			<c:out value="Aceitamos tanto Real como Dólar." />
		</c:when>
		<c:otherwise>
			Nenhuma forma de pagamento foi informada.
			<a href="ExemploJSTL008_a.jsp"> Voltar</a>
		</c:otherwise>
	</c:choose>

</body>
</html>