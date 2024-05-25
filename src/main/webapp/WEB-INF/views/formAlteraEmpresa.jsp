<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<c:url value="/controllerServlet" var="link" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterando empresa</title>
</head>
<body>

	<form action="${link }" method="post">
		<input type="text" name="id" value="${empresa.id }"> 
		<input	type="text" name="acao" value="alteraEmpresa"> Nome: 
		<input	type="text" name="nome" value="${empresa.nome}" /> Data Abertura: <input type="text" name="data" value="<fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy"/>" />
		<button type="submit">Enviar</button>
	</form>

</body>
</html>