<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:import url="logout.jsp" />
        <c:if test= "${not empty nomeEmpresa}">
            Empresa ${ nomeEmpresa } cadastrada com sucesso!
        </c:if>

        <c:if test= "${empty nomeEmpresa}">
            Nenhuma empresa cadastrada!
        </c:if>


</body>
</html>