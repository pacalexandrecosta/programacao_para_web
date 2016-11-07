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

	<h3>Lista dos cookies existentes</h3>
	<ul>
		<c:forEach var="cookies" items="${cookie}">
			<li>
				<c:out value="${cookies.key}" />:
			 	Objeto=<c:out value="${cookies.value}" />, 
			 	valor=<c:out value="${cookies.value.value}" />
			 </li>
		</c:forEach>
	</ul>
	
	${cookie.JSESSIONID }


</body>
</html>