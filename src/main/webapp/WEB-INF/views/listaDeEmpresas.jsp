<%@page import="gerenciador.model.Empresa"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${not empty nomeEmpresa}">
            Empresa ${ nomeEmpresa } cadastrada com sucesso!
        </c:if>

	Lista de empresas:
	<br />
	<ul>
		<c:forEach items="${empresas}" var="empresa">


			<li>${empresa.nome}- <fmt:formatDate
					value="${empresa.dataAbertura }" pattern="dd/MM/yyyy" /> <a
				href="/gerenciador/controllerServlet?acao=mostraEmpresa&id=${empresa.id}">editar</a> <a
				
				href="/gerenciador/controllerServlet?acao=removeEmpresa&id=${empresa.id}">remove</a>
			</li>


		</c:forEach>
	</ul>

</body>
</html>