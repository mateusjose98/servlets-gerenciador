<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<c:url value="/controllerServlet?acao=listaEmpresas" var="link"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bem vindo</title>
</head>
<body>

<a href="${link}">Começar</a>


</body>
</html>